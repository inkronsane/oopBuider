package com.inkronsane.oop3.DataTier.CoreComponents;


import com.inkronsane.oop3.DataTier.price.Price;

public enum PowerSupply implements Price {
    CORSAIR_600W("Corsair 600W", 50.0, "ATX 12V 2.4", "80+ Bronze", "600W"),
    EVGA_750W("EVGA 750W", 70.0, "ATX 12V 2.4", "80+ Gold", "750W"),
    SEASONIC_850W("Seasonic 850W", 100.0, "ATX 12V 2.4", "80+ Platinum", "850W"),
    THERMALTAKE_1000W("Thermaltake 1000W", 120.0, "ATX 12V 2.4", "80+ Titanium", "1000W");

    private final String name;
    private final double price;
    private final String formFactor;
    private final String efficiency;
    private final String wattage;

    PowerSupply(String name, double price, String formFactor, String efficiency, String wattage) {
        this.name = name;
        this.price = price;
        this.formFactor = formFactor;
        this.efficiency = efficiency;
        this.wattage = wattage;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nForm Factor: " + formFactor +
            "\nEfficiency: " + efficiency +
            "\nWattage: " + wattage;
    }


    public String getName() {
        return name;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String getWattage() {
        return wattage;
    }
}
