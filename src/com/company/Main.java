//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");
        dog.name = "Szarik";
        dog.species = "canis";
        dog.weight = 21.3D;
        dog.age = 5;
        dog.alive = true;
        System.out.println(dog.name);
        cat.name = "Sierśiuch";
        System.out.println("a kot żyje?" + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();
        cat.doYouLike("mouse");
        dog.doYouLike("mouse");
        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanAge + " years old");
        Human me = new Human();
        me.firstName = "Jakub";
        me.lastName = "Hałas";
        me.pet = dog;
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it " + me.pet.name);


        System.out.println("I have " + me.car.producer + " " + me.car.model);
        System.out.println("waga psa: " + dog.weight);
        me.getSalary();
    }
}
