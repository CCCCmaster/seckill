package org.seckill.rocketmq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.seckill.utils.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * Created by Idea
 *
 * @author ccccmaster
 * @date: 18-7-27
 * @time: 下午5:05
 */
//@Configuration
public class Producer {
    /* 日志 */
//    private static final Logger logger = LoggerFactory.getLogger(
//            Producer.class
//    );
//
//    @Value("${rocketmq.producer.producerGroup}")
//    private String producerGroup;
//
//    @Value("${rocketmq.namesrvAddr}")
//    private String namesrvAddr;
//
//    /**
//     * 消息生产者
//     * @return DefaultMQProducer 默认的生产者
//     */
//    @Bean
//    public DefaultMQProducer getProducer(){
//        DefaultMQProducer mqProducer = new
//                DefaultMQProducer(producerGroup);
//        mqProducer.setNamesrvAddr(namesrvAddr);
//        try {
//            mqProducer.start();
//        } catch (MQClientException e) {
//            logger.debug(e.getErrorMessage());
//        }
//        return mqProducer;
//    }
//
//    /**
//     * 把对象转换成能直接在队列中传输的Message
//     * @param topic Topic
//     * @param tags Tag
//     * @param info 待发送的对象
//     * @return Message 消息对象
//     */
//    public static Message messageWrapper(String topic, String tags,
//                                         Object info){
//        byte[] byteArr = IOUtils.toByteArray(info);
//        return new Message(
//                topic, tags, byteArr
//        );
//    }

}
