package com.inkronsane.oop3.DataTier.HelperComponents;


import com.inkronsane.oop3.DataTier.price.Price;

public enum Mouse implements Price {
    LOGITECH_G_PRO("Logitech G Pro", 50.0, "Optical", 16000),
    STEELSERIES_RIVAL_600("SteelSeries Rival 600", 60.0, "Dual Optical Sensor", 12000),
    RAZER_DEATHADDER_ELITE("Razer DeathAdder Elite", 45.0, "Optical", 16000),
    CORSAIR_DARK_CORE_RGB_SE("Corsair Dark Core RGB/SE", 70.0, "Optical", 16000),
    HP_SPECTRE_REACTOR("HP Spectre Reactor", 55.0, "Optical", 16000);

    private final String name;
    private final double price;
    private final String sensorType;
    private final int dpi;

    Mouse(String name, double price, String sensorType, int dpi) {
        this.name = name;
        this.price = price;
        this.sensorType = sensorType;
        this.dpi = dpi;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nSensor Type: " + sensorType +
            "\nDPI: " + dpi;
    }


    public String getName() {
        return name;
    }

    public String getSensorType() {
        return sensorType;
    }

    public int getDpi() {
        return dpi;
    }
}

