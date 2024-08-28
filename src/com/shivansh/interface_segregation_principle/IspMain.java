package com.shivansh.interface_segregation_principle;

public class IspMain {
    public static void main(String[] args) {
        EngineStartable convertible = new Convertible();
        SunroofOperable sunroofConvertible = (SunroofOperable) convertible;
        GPSActivatable gpsConvertible = (GPSActivatable) convertible;

        convertible.startEngine();
        sunroofConvertible.openSunroof();
        gpsConvertible.activateGps();

        EngineStartable hatchback = new Hatchback();
        GPSActivatable gpsHatchback = (GPSActivatable) hatchback;

        hatchback.startEngine();
        gpsHatchback.activateGps();
    }
}
