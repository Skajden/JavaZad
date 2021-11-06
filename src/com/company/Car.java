//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Car extends Device implements Saleable{
    String producer;
    String model;
    Double millage;
    Double engineSize;
    Integer yearOfProduction;
    String color;

    public Car(String producer, String model, Double millage, Integer yearOfProduction, Double engineSize, String color) {
        super("producer", "model", 1992);
    }

    public boolean equals(Car car) {
        if (this == car) {
            return true;
        } else {
            return this.producer.equals(car.producer) && this.model.equals(car.model) && this.millage.equals(car.millage);
        }
    }

    public void turnOn () {
        System.out.println("Przekręcam kluczyk");
    }
    public void saleable() {
        if(buyer.cash >= price) {
            System.out.println("KUPUJĄCY MA MAŁO KASY");
        }else if(seller.getCar() = null) {
            syste.out.println()

        }
    }
}

