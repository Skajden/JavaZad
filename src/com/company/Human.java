//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary = 1200.0D;
    Animal pet;
    Car car;

    Human() {
        super("homo sapiens");
    }

    void setSalary(Double salary) {
        if (salary > 0.0D) {
            this.salary = salary;
        }

    }

    Double getSalary() {
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }
}
