package com.base.exception;

public class OnlineCourseException extends RuntimeException {
    private static final long serialVersionUID = 5565760508056698922L;

    private String errMessage;

    public OnlineCourseException() {
        super();
    }

    public OnlineCourseException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(CommonError commonError){
        throw new OnlineCourseException(commonError.getErrMessage());
    }
    public static void cast(String errMessage){
        throw new OnlineCourseException(errMessage);
    }
}

/**
 * @description TODO
 * @author LSK
 * @date 2023/6/23 22:33
 * @version 1.0
 */