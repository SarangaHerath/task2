package com.saara.springbootkafka.controller;

import com.saara.springbootkafka.model.Vehicle;
import com.saara.springbootkafka.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @PostMapping("/publish")
    public void getVehicleDetails(@RequestBody Vehicle vehicle) {
        try{
            Vehicle vehicleDetails = vehicleService.getVehicleDetails(vehicle);
            String s = String.valueOf(vehicleDetails);
            kafkaTemplate.send("vehicle",s);
        } catch (Exception e) {
            throw e;
        }
    }
}
