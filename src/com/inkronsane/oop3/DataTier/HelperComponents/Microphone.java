package com.inkronsane.oop3.DataTier.HelperComponents;


import com.inkronsane.oop3.DataTier.price.Price;

public enum Microphone implements Price {
    BLUE_YETI("Blue Yeti", 100.0, "USB", "Cardioid, Bidirectional, Omnidirectional, Stereo",
        "Gain control"),
    AUDIO_TECHNICA_AT2020("Audio-Technica AT2020", 120.0, "XLR", "Cardioid", "Low-mass diaphragm"),
    RODE_NT_USB("Rode NT-USB", 150.0, "USB", "Cardioid", "Pop shield, tripod desk stand"),
    HYPERX_QUAD_CAST("HyperX QuadCast", 140.0, "USB",
        "Cardioid, Bidirectional, Omnidirectional, Stereo", "Anti-vibration shock mount"),
    SAMSON_GO_MIC("Samson Go Mic", 40.0, "USB", "Cardioid, Omni", "Portable design");


    private final String name;
    private final double price;
    private final String connectivity;
    private final String pickupPatterns;
    private final String additionalFeatures;

    Microphone(String name, double price, String connectivity, String pickupPatterns,
        String additionalFeatures) {
        this.name = name;
        this.price = price;
        this.connectivity = connectivity;
        this.pickupPatterns = pickupPatterns;
        this.additionalFeatures = additionalFeatures;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nConnectivity: " + connectivity +
            "\nPickup Patterns: " + pickupPatterns +
            "\nAdditional Features: " + additionalFeatures;
    }


    public String getName() {
        return name;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public String getPickupPatterns() {
        return pickupPatterns;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }
}
