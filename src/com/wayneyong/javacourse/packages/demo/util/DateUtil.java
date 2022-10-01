package com.wayneyong.javacourse.packages.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String DATE_FORMAT = "dd/mm/yyyy";

    public static String formatDate(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(d);
    }
}
