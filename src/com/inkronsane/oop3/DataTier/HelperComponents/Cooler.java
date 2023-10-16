package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Cooler implements Price {
    NoctuaNH_D15("Noctua NH-D15", 90.0, "Air Cooler", "Dual Tower Design", "140mm Fans"),
    CorsairH100iRGBPlatinum("Corsair H100i RGB Platinum", 120.0, "Liquid Cooler", "240mm Radiator",
        "RGB Lighting"),
    BeQuietDarkRockPro4("be quiet! Dark Rock Pro 4", 85.0, "Air Cooler", "Dual Tower Design",
        "Silent Wings Fans"),
    NZXTKrakenX63("NZXT Kraken X63", 130.0, "Liquid Cooler", "280mm Radiator",
        "Infinity Mirror Design"),
    CoolerMasterHyper212("Cooler Master Hyper 212", 40.0, "Air Cooler", "Single Tower Design",
        "Direct Contact Technology");

    private final String name;
    private final double price;
    private final String type;
    private final String radiatorSize;
    private final String features;

    Cooler(String name, double price, String type, String radiatorSize, String features) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.radiatorSize = radiatorSize;
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
            "\nRadiator size: " + radiatorSize +
            "\nFeatures: " + features;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRadiatorSize() {
        return radiatorSize;
    }

    public String getFeatures() {
        return features;
    }
}
