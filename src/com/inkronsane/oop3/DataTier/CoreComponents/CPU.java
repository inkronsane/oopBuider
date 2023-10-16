package com.inkronsane.oop3.DataTier.CoreComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum CPU implements Price {
    INTEL_I9("Intel Core i9", 500.0, "LGA 1200", "10 cores, 20 threads", 4.5),
    INTEL_I7("Intel Core i7", 350.0, "LGA 1200", "8 cores, 16 threads", 4.0),
    INTEL_I5("Intel Core i5", 250.0, "LGA 1200", "6 cores, 12 threads", 3.5),
    INTEL_I3("Intel Core i3", 150.0, "LGA 1200", "4 cores, 8 threads", 3.2),
    AMD_RYZEN_9("AMD Ryzen 9", 450.0, "AM4", "12 cores, 24 threads", 4.6),
    AMD_RYZEN_7("AMD Ryzen 7", 300.0, "AM4", "8 cores, 16 threads", 4.0),
    AMD_RYZEN_5("AMD Ryzen 5", 200.0, "AM4", "6 cores, 12 threads", 3.6),
    AMD_RYZEN_3("AMD Ryzen 3", 100.0, "AM4", "4 cores, 8 threads", 3.0);

    private final String name;
    private final double price;
    private final String supportedSocket;
    private final String specs;
    private final double clockSpeed;

    CPU(String name, double price, String supportedSocket, String specs, double clockSpeed) {
        this.name = name;
        this.price = price;
        this.supportedSocket = supportedSocket;
        this.specs = specs;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nSupported socket: " + supportedSocket +
            "\nSpecs: " + specs +
            "\nClock speed: " + clockSpeed;
    }

    public String getName() {
        return name;
    }

    public String getSupportedSocket() {
        return supportedSocket;
    }

    public String getSpecs() {
        return specs;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

