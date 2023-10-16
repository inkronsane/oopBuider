package com.inkronsane.oop3.DataTier.CoreComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Motherboard implements Price {
    MSI_B450("MSI B450 TOMAHAWK", 120.0, "AM4", "ATX", "DDR4"),
    ASUS_ROG_STRIX("ASUS ROG STRIX Z490-E", 240.0, "LGA 1200", "ATX", "DDR4"),
    GIGABYTE_X570("GIGABYTE X570 AORUS ELITE", 180.0, "AM4", "ATX", "DDR4"),
    MSI_Z490("MSI MPG Z490 GAMING EDGE WIFI", 200.0, "LGA 1200", "ATX", "DDR4");

    private final String name;
    private final double price;
    private final String supportedSocket;
    private final String formFactor;
    private final String memoryType;

    Motherboard(String name, double price, String supportedSocket, String formFactor,
        String memoryType) {
        this.name = name;
        this.price = price;
        this.supportedSocket = supportedSocket;
        this.formFactor = formFactor;
        this.memoryType = memoryType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nSupported Socket: " + supportedSocket +
            "\nForm Factor: " + formFactor +
            "\nMemory Type: " + memoryType;
    }


    public String getName() {
        return name;
    }

    public String getSupportedSocket() {
        return supportedSocket;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getMemoryType() {
        return memoryType;
    }
}
