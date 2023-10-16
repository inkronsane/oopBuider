package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Headphones implements Price {
    SONY_WH1000XM4("Sony WH-1000XM4", 250.0, "Over-Ear", "Wireless", "Noise Cancelling"),
    BOSE_QUIETCOMFORT35II("Bose QuietComfort 35 II", 230.0, "Over-Ear", "Wireless",
        "Noise Cancelling"),
    SENNHEISER_HD660S("Sennheiser HD 660 S", 400.0, "Over-Ear", "Wired", "Open-back design"),
    BEYERDYNAMIC_DT990PRO("Beyerdynamic DT 990 Pro", 150.0, "Over-Ear", "Wired",
        "Open-back design"),
    APPLE_AIRPODSPRO("Apple AirPods Pro", 200.0, "In-Ear", "Wireless", "Noise Cancelling");


    private final String name;
    private final double price;
    private final String type;
    private final String connectivity;
    private final String features;

    Headphones(String name, double price, String type, String connectivity, String features) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.connectivity = connectivity;
        this.features = features;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nType: " + type +
            "\nConnectivity: " + connectivity +
            "\nFeatures: " + features;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public String getFeatures() {
        return features;
    }
}
