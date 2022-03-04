
package com.company.device;

import com.company.Car;
import com.company.Device;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {

    private static final int DEFAULT_APP_VERSION = 1;
    private static final double DEFAULT_SERVER_NAME = 1;
    private String[] appName;
    private String nazwa;
    private int cena;
    private String wersja;
    private int pieniadze;
    private String aplikacja;

    public  Phone (String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("Trzymasz przycisk i czekasz");
        System.out.println("Trzymasz przycisk i czekasz");
        System.out.println("Trzymasz przycisk i czekasz");
        System.out.println("Trzymasz przycisk i czekasz");
        System.out.println("o, włączyło się");
    }

    public void installAnApp(String appName, int version, double defaultServerName){
        System.out.println("Instalowanie aplikacji " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, int version){
        System.out.println("Instalowanie aplikacji " + appName + "w wersji" + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public  void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL ("https", server, 443, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void installAnApp(URL url) {
        //log
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appName) {
            this.installAnApp(Collections.singletonList(appName));

        }
    }

    public final class paliwo extends
            Car.Disel, Car.LPG,Car.Electric {

    }

    public void Appliction1(String nazwa,String wersja,int cena){
        this.nazwa = "Iphone";
        this.wersja = "Pro";
        this.cena = 2000;


    }

    public void Appliction2(String nazwa,String wersja,int cena){
        this.nazwa = "Android";
        this.wersja = "Max";
        this.cena = 1000;


    }

    public void Kupujacy(int pieniadze, String aplikacja){
        this.pieniadze = 5000;
        this.aplikacja = "aplikacja";
    }

    public static void instaling(){
        if (this.pieniadze > 2000) {
            System.out.println("Nie stać cię na aplikacje");
        } else {
            System.out.println("Masz pieniądze");
            this.aplikacja = "Iphone";
            this.pieniadze - 5000 - 2000;
        }

        public static void SprawdzanieAplikacji(){
            if (this.aplikacja == "Iphone") {
                System.out.println("Masz zainstalowana aplikacje iphone");
                System.out.println("Lista aplikacji: " this.aplikacja);
            } else {
                System.out.println("Nie masz zainstalowanej aplikacji");

            }


    }



}