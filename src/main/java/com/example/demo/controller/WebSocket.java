package com.example.demo.controller;

/**
 * Created by p78o2 on 2018-2-1.
 */

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 10  * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 11  * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 12  */
@ServerEndpoint(value = "/websocket")
@Component
public class WebSocket {
//    静态变量用于记录在线人数
    private static  int onLineCount = 0;

    private static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<WebSocket>();

//    与某个客户端连接会话，需要通过它来发送数据
    private Session session;

//    成功建立的调用方法
//    session参数可选
    @OnOpen
    public void onOpen(Session session)
    {
        this.session = session;
        webSocketSet.add(this);
        addOnlineCount();
        System.out.println(getOnlineCount());
    }
//    连接关闭
    @OnClose
    public void onClose(){
        webSocketSet.remove(this);
        sunOnlineCount();
        System.out.println(getOnlineCount());
    }
//    收到客户端消息后调用的方法
//    message客户端发送过来的参数
//    session 可选参数
    @OnMessage
    public void onMessage(String messsage,Session session)
    {
        System.out.println("来自客户端的消息"+messsage);
        for(WebSocket item : webSocketSet){
            try{
//                发送消息的方法
                item.sendMessage(messsage);
            }
            catch (IOException e){
                e.printStackTrace();
                continue;
            }
        }
    }
    @OnError
    public void onError(Session session,Throwable error)
    {
        System.out.println("发生错误");
        error.printStackTrace();
    }
    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }
    public void addOnlineCount()
    {
        WebSocket.onLineCount++;
    }
    public void sunOnlineCount()
    {
        WebSocket.onLineCount--;
    }
    public int getOnlineCount(){
        return WebSocket.onLineCount;
    }
}
