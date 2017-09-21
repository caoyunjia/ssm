package com.cn.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by A on 2017/8/4.
 */
public class CommonUtils {
    /**
     * 格式化日期->字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String formatDate(Date date, String format) {
        if (date == null || format == null) {
            return null;
        }
        return new SimpleDateFormat(format).format(date);
    }


    /**
     * 当前时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 当前日期，8位字符串
     *
     * @return
     */
    public static String now8() {
        return formatDate(now(), "yyyyMMdd");
    }

}
