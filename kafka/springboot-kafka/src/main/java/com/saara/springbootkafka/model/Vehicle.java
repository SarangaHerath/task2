package com.saara.springbootkafka.model;

public class Vehicle {
    private  String name;
    private String vehicle_number;
    private String color;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String name, String vehicle_number, String color, String model) {
        this.name = name;
        this.vehicle_number = vehicle_number;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
