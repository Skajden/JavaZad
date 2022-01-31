//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    Human() {
        super("homo sapiens");
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Dane wysłane do systemu");
            this.salary = salary;
            System.out.println("Nowe wynagrodzenie: " + this.salary);
        } else {
            System.out.println("Chyba");
        }

    }

    Double getSalary() {
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }

    public Car getCar(){
        return this.car;
    }
}
