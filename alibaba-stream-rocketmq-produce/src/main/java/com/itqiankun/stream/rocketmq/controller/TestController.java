package com.itqiankun.stream.rocketmq.controller;

import com.itqiankun.stream.rocketmq.messaging.TestMessaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Lion Li
 */
@RestController
public class TestController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/stream-test-msg")
    public String streamTestMsg(String msg){
        // 构建消息对象
        TestMessaging testMessaging = new TestMessaging()
                .setMsgId(UUID.randomUUID().toString())
                .setMsgText(msg);
        streamBridge.send("demo-out-0", MessageBuilder.withPayload(testMessaging).build());
        return "投递消息 => " + msg + " => 成功";
    }
}
