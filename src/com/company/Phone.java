package com.company.device;

import com.company.Device;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;

public class Phone extends Device {

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

    public void installAnApp(String appName){
        System.out.println("Instalowanie aplikacji " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version){
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
            this.installAnApp(appName);

        }
    }
}