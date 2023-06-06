package com.mudemo.common;

import lombok.Getter;
import lombok.Setter;

//
@Getter
public enum BusinessMsgEnum {
    /**
     * 参数异常
     */
    PARMETER_EXCEPTION("101", "参数异常!"),
    /**
     * 等待超时
     */
    SERVICE_TIME_OUT("102", "服务超时！"),
    /**
     * 参数过大
     */
    PARMETER_BIG_EXCEPTION("903", "内容不能超过200字，请重试!"),
    /**
     * 数据库操作失败
     */
    DATABASE_EXCEPTION("509", "数据库操作异常，请联系管理员！"),
    /**
     * 500 : 一劳永逸的提示也可以在这定义
     */
    UNEXPECTED_EXCEPTION("500", "系统发生异常，请联系管理员！");
    // 还可以定义更多的业务异常

    /**
     * 消息码
     */
    public String code;
    /**
     * 消息内容
     */
    public String msg;

    private BusinessMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    // set get方法
}
