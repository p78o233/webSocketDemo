package com.example.demo.controller;

import com.example.demo.CallBack.CallBackResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by p78o2 on 2018-2-1.
 */
@RestController

public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public CallBackResult testScoket(HttpServletRequest request, HttpServletResponse response){
        return null;
    }

//    websocket文件
}
