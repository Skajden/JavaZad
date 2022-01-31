//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;
    Boolean feed;
    Integer takeForAWalk;

    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 21.3D;
        } else if (this.species == "felis") {
            this.weight = 2.5D;
        } else {
            this.weight = 1.0D;
        }

    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, I like " + foodType);
        } else {
            System.out.println("no you idiot ");
        }

    }

    Integer getHumanAge() {
        if (this.species == "canis") {
            return this.age * 7;
        } else {
            return this.species == "felis" ? this.age * 10 : this.age;
        }
    }

    Double feed() {
        if (this.species == "canis") {
            this.weight = this.weight + 1.0D;
            return this.weight;
        } else {
            return null;
        }
    }
}

qqq