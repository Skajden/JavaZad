package com.company;

public class Phone extends Device {
    String model;
    String producent;
    String screenSize;
    String os;
    String yearOfProductiom;

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", os='" + os + '\'' +
                ", yearOfProductiom='" + yearOfProductiom + '\'' +
                '}';
    }
}
