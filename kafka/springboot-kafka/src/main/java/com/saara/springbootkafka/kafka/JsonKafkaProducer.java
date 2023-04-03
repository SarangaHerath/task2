package com.saara.springbootkafka.kafka;

import com.saara.springbootkafka.model.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);

//    private KafkaTemplate<String, Vehicle> kafkaTemplate;
//
//    public JsonKafkaProducer(KafkaTemplate<String, Vehicle> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(Vehicle data){

        LOGGER.info(String.format("Message sent -> %s",data.toString()));

        Message<Vehicle> message= MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"vehicle")
                .build();
        kafkaTemplate.send(message);
    }
}
