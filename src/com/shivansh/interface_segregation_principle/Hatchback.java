package com.shivansh.interface_segregation_principle;

public class Hatchback implements EngineStartable, GPSActivatable {
    @Override
    public void startEngine() {
        System.out.println("Starting Hatchback Engine");
    }

    @Override
    public void activateGps() {
        System.out.println("Activating GPS");
    }
}