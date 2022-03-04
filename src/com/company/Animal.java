package com.company;

abstract class Animal {
    private static final double DEFAULT_FOOD_WEIGHT =1.0 ;
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;



    Animal(String species) {
        this.species = species;
        this.alive = true;

        if (this.species == "canis") {
            this.weight = 21.3;
        } else if (this.species == "felis") {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, I like " + foodType);
        } else {
            System.out.println("no you dont ");
        }
    }

    Integer getHumanAge() {
        if (this.species == "canis") {
            return this.age * 7;
        } else if (this.species == "felis") {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(double foodWeight) {
        if (this.weight <= 0) {
            System.out.println("trochę za późno");
        } else {
            this.weight += foodWeight;
            System.out.println("Dzięki zza  zarcie");
        }
    }

    public abstract void hasCar();

    public class FarmAnimal implements Edbile{
        super();

        public void beEaten() {

            System.out.println("Moźna jeść");
        }

    }

    public class Pet{
        super();

    }

    interface Edbile{

       void beEaten();
    }

    interface Feedable{

        void feed();
        <foodWeight> void feed(foodWeight);
    }


    package creatures{



        class FarmAnimal;
        class Pet;
        interface Edible;
        interface feed();
        interface feed(foodWeight);

    }
}