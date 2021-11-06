//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Car {
    public String producer;
    public String model;
    public Double millage;
    public Double engineSize;
    public Double value;
    public String plates;
    public Integer yearOfProduction;

    public Car(String producer, String model, Integer yearOfProduction) {
      super("producer", "model", "1992");

    }

    public boolean equals(Car car) {
        if (this == car) {
            return true;
        } else if (this.producer.equals(car.producer)
                && this.model.equals(car.model)
                && this.millage.equals(car.millage)
                && this.plates.equals(car.plates)) {
            return true;
        } else {
            return false;
        }
    }