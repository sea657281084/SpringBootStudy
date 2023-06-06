package com.mudemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.mudemo.common.ResponseInfo;
import com.mudemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    /**
     * 测试全局异常处理
     */
    @RequestMapping(value = "/exceptionHandler", method = RequestMethod.GET)
    public ResponseInfo test() {
        try {
            // 模拟异常业务代码
            int num = 1 / 0;
            return new ResponseInfo("测试数据");
        } catch (Exception e) {
            return new ResponseInfo(500, "系统异常，请联系管理员！");
        }
    }
}
