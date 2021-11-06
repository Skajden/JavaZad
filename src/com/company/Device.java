package com.company;

public class Device {
    String model;
    String producent;
    String yearOfProductiom;

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", yearOfProductiom='" + yearOfProductiom + '\'' +
                '}';
    }
}
