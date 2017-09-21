package com.cn.job;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by A on 2017/9/4.
 */
@Service
public class MySecondJob {
        private static int counter = 0;
        protected void execute()  {
            long ms = System.currentTimeMillis();
            System.out.println("\t\t" + new Date(ms));
            System.out.println("(" + counter++ + ")");
            System.out.println("吃饭了没有2");
    }
}
