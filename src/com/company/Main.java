package com.company;


public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Rocky";
        dog.species = "canis";
        dog.weight = 17.1;
        dog.age = 9;
        dog.alive = true;
        System.out.println(dog.name);

        cat.name = "Fafik";
        System.out.println("a kot żyje?" + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Konrad";
        me.lastName = "Greniuk";

        me.pet = dog;
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it " + me.pet.name);

        Car fiat = new Car();
        fiat.producer = "Fiat";
        fiat.model = "Punto";
        fiat.millage = 256900.0;
        fiat.engineSize = 1.4;

        me.car = fiat;

        System.out.println("I have " + me.car.producer + " " + me.car.model);
        System.out.println("waga psa: " + dog.weight);

    }
}
