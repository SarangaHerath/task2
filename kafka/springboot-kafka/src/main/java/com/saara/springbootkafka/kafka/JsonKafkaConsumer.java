package com.saara.springbootkafka.kafka;

import com.saara.springbootkafka.model.Vehicle;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "vehicle", groupId = "myGroup")
    public void consume(Vehicle vehicle){

    }
}
