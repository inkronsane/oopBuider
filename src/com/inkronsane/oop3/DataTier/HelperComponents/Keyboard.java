package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Keyboard implements Price {
    LOGITECH_K120("Logitech K120", 20.0, "Wired", "Standard", "US layout"),
    CORSAIR_K95_RGB_PLATINUM_XT("Corsair K95 RGB Platinum XT", 160.0, "Wired", "Mechanical",
        "RGB Backlit"),
    RAZER_BLACK_WIDOW_ELITE("Razer BlackWidow Elite", 90.0, "Wired", "Mechanical", "RGB Chroma"),
    STEEL_SERIES_APEX_PRO("SteelSeries Apex Pro", 180.0, "Wired", "Mechanical",
        "Customizable switches"),
    KEYCHRON_K6("Keychron K6", 60.0, "Wireless", "Mechanical", "Compact 65% layout");

    private final String name;
    private final double price;
    private final String connectionType;
    private final String keyType;
    private final String features;

    Keyboard(String name, double price, String connectionType, String keyType, String features) {
        this.name = name;
        this.price = price;
        this.connectionType = connectionType;
        this.keyType = keyType;
        this.features = features;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nConnection Type: " + connectionType +
            "\nKey Type: " + keyType +
            "\nFeatures: " + features;
    }


    public String getName() {
        return name;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public String getKeyType() {
        return keyType;
    }

    public String getFeatures() {
        return features;
    }
}