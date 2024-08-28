package com.shivansh.interface_segregation_principle;

public class Convertible implements EngineStartable, SunroofOperable, GPSActivatable {
    @Override
    public void startEngine() {
        System.out.println("Starting Convertible Engine");
    }

    @Override
    public void openSunroof() {
        System.out.println("Opening Sunroof");
    }

    @Override
    public void activateGps() {

    }
}