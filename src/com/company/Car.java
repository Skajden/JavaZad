
package com.company;
import  com.company.Human;
import  com.company.Saleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable {
    public String producer;
    public String model;
    public Double millage;
    public Double engineSize;
    public Integer yearofproduction;
    public Double value;
    public Strinzg plates;
    public Car(String producer, String model, Double millage, Integer yearofproduction, Double value, String plates) {
    }
    public boolean equals(Car car) {
        if (this == car) {
            return  true;
        } else if (this.producer.equals(car.producer)
                && this.model.equals(car.model)
                && this.millage.equals(car.millage)
                && this.plates.equals(car.plates)) {
            return true;
        } else {
            return false;
        }
    }
    public void turnOn() { System.out.println("Przekream kluczyk");}
    public void sale(Human seller, Human buyer, Double price){
        if (buyer.cash <price) {
            System.out.println("Kupujacy ma za malo kasy");
        } else if (seller.hasCar(this)) {
            System.out.println("SPRZEDAJĄCY NIE MA AUTA");
        } else if (buyer.hasFreeParkingLot()) {
            System.out.println("Kupujacy nie ma miejsca");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("transkcja sue udala , kupiono" + this);
        }
    }

    public class Electric extends refeul{
        int Electric= 2;
        public void refeul() {
            if (Electric > 0) {
                System.out.println("Kup Paliwo");
            }

            if (Electric < 0) {
                System.out.println("Masz Paliwo");
            }
        }

    }

    public class Disel extends refeul{
        int Disel = 4;

        public void refeul() {
            if (Disel > 0) {
                System.out.println("Kup Paliwo");
            }

            if (Disel < 0) {
                System.out.println("Masz Paliwo");
            }
        }

    }

    public class LPG extends refeul{
        int LPG =1;
        public void refeul() {
            if (LPG > 0) {
                System.out.println("Kup Paliwo");
            }

            if (LPG < 0) {
                System.out.println("Masz Paliwo");
            }
        }
    }

    public abstract class refeul{
        public abstract void refeul();

    }

public class wlascicielPojazdu{
        public static void main(String[] args){
            List myList = new ArrayList();

            myList.add("Adam");
            myList.add("Marek");
            myList.add("Jan");


            System.out.println("Aktualny właściciel: ");
            System.out.println( myList.get(myList.size()-1));


            for(int i=0; i <myList.size(); i++){
                Object next = myList.get(i);
            }
        }
}

}


