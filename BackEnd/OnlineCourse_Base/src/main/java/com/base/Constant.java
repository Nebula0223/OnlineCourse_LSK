package com.base;

public class Constant {
    public static final int VideoTimeSegment = 20;

    //每分钟的请求量门槛，如果每分钟实际请求量小于这个门槛，就触发压缩视频
    public static final int MinuteThreshold = 60;

    public static String getBackEndAbsolutePath() {
        String currentPath = System.getProperty("user.dir");
        int index = currentPath.indexOf("BackEnd");
        return currentPath.substring(0,index) + "BackEnd/";
    }

    public static String getChunksFolder() {
        return getBackEndAbsolutePath() + "video/chunks/";
    }

    public static String getMergedFolder() {
        return getBackEndAbsolutePath() + "video/merged/";
    }

    public static String getTimedFolder() {
        return getBackEndAbsolutePath() + "video/timed/";
    }

    public static String getCompressedFolder() {
        return getBackEndAbsolutePath() + "video/compressed/";
    }

    public static String getResolutionFolder() {
        return getBackEndAbsolutePath() + "video/resolution/";
    }

    public static String getVideoDisplayImageFolder() {
        return getBackEndAbsolutePath() + "image/videoDisplayImage";
    }


}
