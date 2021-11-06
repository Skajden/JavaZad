package com.company;

public class Device {
        final public String producer;
        final public String model;
        final public Integer yearOfProduction;
        public double value;

        public device(String producer, String model, Integer yearOfProduction){

                this.producer = producer;
                this.model = model;
                this.yearOfProduction = yearOfProduction;
        }
}