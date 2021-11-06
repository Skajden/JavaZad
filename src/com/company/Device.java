package com.company;

public class Device {
        public final String model;
        public final String producer;
        public final Integer yearOfProduction;
        public Double value;

        public Device(String producer, String model, Integer yearOfProduction) {
                this.producer = producer;
                this.model = model;
                this.yearOfProduction = yearOfProduction;
        }
}
