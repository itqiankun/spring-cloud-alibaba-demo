package com.itqiankun.stream.rocketmq.listener;

import com.itqiankun.stream.rocketmq.messaging.TestMessaging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Slf4j
@Service
public class TestStreamConsumer {

    @Bean
    Consumer<TestMessaging> demo() {
        log.warn("初始化订阅");
        return msg -> {
            log.warn("通过stream消费到消息 => {}", msg.toString());
        };
    }

}
