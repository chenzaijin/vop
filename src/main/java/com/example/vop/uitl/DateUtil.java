package com.example.vop.uitl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtil {

    public static String formatTime(Timestamp tStamp, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(tStamp);
    }
}
