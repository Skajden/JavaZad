package com.company;

import  java.util.Date;

public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private final Car[] garage;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    private Car car;
    public Double cash;

    Human() {
        super("homo sapiens");
        this.salary = 1200.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    Human(Integer garageSize){
        super("homo sapien");
        this.garage = new Car [garageSize];
    }

    void setSalary(Double salary){
        if (salary > 0) {
            System.out.println("Dane wyslane do systemu ksiegowego");
            System.out.println("odbierz aneks od pani hani");
            System.out.println("Zus i us juz wiedza o pieniadzach");
            this.salary = salary;
            System.out.println("nowe wynagrodzenie: " + this.salary);
        } else {
            System.out.println("Nie ma za darmo");
        }
    }

    double getSalary(){
        System.out.println(new Date());
        System.out.println("Wynagrodzenie: " + this.salary);
        return this.salary;
    }

    void setCar(Car newCar) {
        if (this.salary > newCar.value)  {
            this.car = newCar;
            System.out.println("Gratuluje kupłeś za gotówkę");
        } else if (this.salary > newCar.value /12) {
            this.car = newCar;
            System.out.println("kupiłeś na raty");
        } else {
            System.out.println("Nie ma takiego kupowanie");
            System.out.println("do roboty");
            System.out.println("Zmie prce weź kredyt");
        }

    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }


    public boolean hasCar(Car car) {
        return false;
    }

    public void addCar(Car car) {
    }

    public void removeCar(Car car) {
    }

    public boolean hasFreeParkingLot() {
        return false;
    }



}

