package com.company.device;

import com.company.Device;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {

    private static final int DEFAULT_APP_VERSION = 1;
    private static final double DEFAULT_SERVER_NAME = 1;
    private String[] appName;

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
}