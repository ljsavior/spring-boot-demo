package com.eternal.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by yeyang.lj on 2017/10/19.
 */
@Configuration
@EnableScheduling
public class PrintTask {
    ThreadLocal<DateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    @Scheduled(cron = "0/20 * * * * ?") //每20s执行一次
    public void print() {
        System.out.println(dateFormat.get().format(new Date()));
    }
}
