package com.saara.springbootkafka.service;

import com.saara.springbootkafka.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    public Vehicle getVehicleDetails(Vehicle vehicle) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle_number(vehicle.getVehicle_number());
        vehicle1.setName(vehicle.getName());
        vehicle1.setColor(vehicle.getColor());
        vehicle1.setModel(vehicle.getModel());

        return vehicle1;
    }
}
