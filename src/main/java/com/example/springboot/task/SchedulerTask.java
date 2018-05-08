package com.example.springboot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Scheduled 参数可以接受两种定时的设置
 * 1.cron = "*\/6 * * * * ?"
 * 2.fixedRate = 6000
 * 这两种都表示每隔6s执行下任务
 * <p>
 * fixedRate 说明
 * 1.@Scheduled(fixedRate = 6000)                  ：上一次开始执行时间点之后6秒再执行
 * 2.@Scheduled(fixedDelay = 6000)                 ：上一次执行完毕时间点之后6秒再执行
 * 3.@Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次。
 *
 * 启用定时任务时需要在 springboot 的主入口的配置类中配置注解@EnableScheduling
 */
@Component
public class SchedulerTask {
    private Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private int count = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        logger.info("this is scheduler task running " + (count++));
    }

    @Scheduled(fixedRate = 6000)
    private void reportCurrentTime() {
        logger.info("现在时间：" + sdf.format(new Date()));
    }
}
