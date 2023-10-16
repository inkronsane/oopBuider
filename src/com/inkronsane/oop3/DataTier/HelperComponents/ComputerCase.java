package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum ComputerCase implements Price {
    NZXT_H510("NZXT H510", 70.0, "Mid Tower", "ATX, Micro ATX, Mini ITX", "Black"),
    Fractal_Design_Meshify_C("Fractal Design Meshify C", 80.0, "Mid Tower",
        "ATX, Micro ATX, Mini ITX", "Black"),
    Cooler_Master_MasterBox_Q300L("Cooler Master MasterBox Q300L", 50.0, "MicroATX",
        "Micro ATX, Mini ITX", "Black"),
    Corsair_4000D_Airflow("Corsair 4000D Airflow", 90.0, "Mid Tower", "ATX, Micro ATX, Mini ITX",
        "White");

    private final String name;
    private final double price;
    private final String formFactor;
    private final String motherboardSupport;
    private final String color;

    ComputerCase(String name, double price, String formFactor, String motherboardSupport,
        String color) {
        this.name = name;
        this.price = price;
        this.formFactor = formFactor;
        this.motherboardSupport = motherboardSupport;
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nForm Factor: " + formFactor +
            "\nMotherboard Support: " + motherboardSupport +
            "\nColor: " + color;
    }

    public String getName() {
        return name;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getMotherboardSupport() {
        return motherboardSupport;
    }

    public String getColor() {
        return color;
    }
}
