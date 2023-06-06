package com.mudemo.common;

public class ResponseInfo<T> {
    /**
     * 状态码
     */
    public int code;
    /**
     * 响应信息
     */
    public String msg;
    /**
     * 返回数据
     */
    public T data;

    /**
     * 若没有数据返回，默认状态码为 0，提示信息为“操作成功！”
     */
    public ResponseInfo() {
        this.code = 0;
        this.msg = "操作成功！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code
     * @param msg
     */
    public ResponseInfo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为 0，默认提示信息为“操作成功！”
     * @param data
     */
    public ResponseInfo(T data) {
        this.data = data;
        this.code = 0;
        this.msg = "操作成功！";
    }

    /**
     * 有数据返回，状态码为 0，人为指定提示信息
     * @param data
     * @param msg
     */
    public ResponseInfo(T data, String msg) {
        this.data = data;
        this.code = 0;
        this.msg = msg;
    }
    // 省略 get 和 set 方法
}
