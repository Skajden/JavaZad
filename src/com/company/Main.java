package com.company;


import java.rmi.server.ExportException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

        Car fiat = new Car("Fiat", "Bravo",323000.0, 2007);
        fiat.value = 120000.0;
        fiat.model = "bravo";

        me.setSalary(2000.0);
        me.setCar(fiat);
        if (me.getCar(fiat);
        if (me.getCar() !=null) {
            System.out.println(me.getCar().model);
        } else {
            System.out.println("Sory Nie Masz AUTA");
        }
        try {
            System.out.println(me.getCar().model);
        } catch (Exception e) {
            System.out.println("Sory, ale nie masz samochodu");

        }

        System.out.println(me.species);
        me.doYouLike("meet");
        double w = me.weight;

        Human brotherInLow = new Human ();
        me.setCar(fiat);
        fiat.sale(me, brotherInLow, 2000.0);

        Integer[] numbers = new Integer[5];
        numbers[0] = 32;
        numbers[1] = -32;
        numbers[2] = 320;
        numbers[3] = 132;
        numbers[4] = 322;

        System.out.println(numbers[2]);
        System.out.println(numbers[4]);

        String[] names = {"Kasia", "Ania", "Mietek", "Janusz"};
        Integer[] otherNumbers = {1, 2, 3, 432, 123, 243, 2342, 432};

        System.out.println(names.length);

        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(4);
        listOfNumbers.add(123);
        listOfNumbers.add(432);
        listOfNumbers.add(432);
        listOfNumbers.add(432);
        listOfNumbers.add(-1);
        System.out.println(listOfNumbers.size());

        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(4);
        setOfNumbers.add(123);
        setOfNumbers.add(432);
        setOfNumbers.add(432);
        setOfNumbers.add(432);
        setOfNumbers.add(-1);
        System.out.println(setOfNumbers.size());
        System.out.println("debug");

        for (Integer i : listOfNumbers) {
            System.out.println(i);
        }

        for (Integer d : setOfNumbers) {
            System.out.println(d);
        }
    }
}
