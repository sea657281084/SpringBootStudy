package com.mudemo.exception;


import com.mudemo.common.BusinessMsgEnum;

public class BusinessErrorException{

    private static final long serialVersionUID = -7480022450501760611L;

    /**
     * 异常码
     */
    private String code;
    /**
     * 异常提示信息
     */
    private String msg;

    public BusinessErrorException(BusinessMsgEnum businessMsgEnum) {
        this.code = businessMsgEnum.code;
        this.msg = businessMsgEnum.msg;
    }
    // get set方法
}
