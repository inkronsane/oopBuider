package com.inkronsane.oop3.DataTier.CoreComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Storage implements Price {
    KINGSTON_SSD_120GB("Kingston SSD 120GB", 40.0, "SSD", "120GB", "SATA III", "500MB/s"),
    SAMSUNG_SSD_250GB("Samsung SSD 250GB", 70.0, "SSD", "250GB", "SATA III", "550MB/s"),
    WD_SSD_500GB("WD SSD 500GB", 120.0, "SSD", "500GB", "NVMe", "2000MB/s"),
    CRUCIAL_SSD_1TB("Crucial SSD 1TB", 150.0, "SSD", "1TB", "SATA III", "560MB/s"),
    SEAGATE_HDD_1TB("Seagate HDD 1TB", 40.0, "HDD", "1TB", "SATA III", "160MB/s"),
    TOSHIBA_HDD_2TB("Toshiba HDD 2TB", 60.0, "HDD", "2TB", "SATA III", "180MB/s"),
    WD_HDD_4TB("WD HDD 4TB", 90.0, "HDD", "4TB", "SATA III", "200MB/s"),
    HITACHI_HDD_6TB("Hitachi HDD 6TB", 120.0, "HDD", "6TB", "SATA III", "210MB/s");

    private final String name;
    private final double price;
    private final String type;
    private final String capacity;
    private final String interfaceType;
    private final String speed;

    Storage(String name, double price, String type, String capacity, String interfaceType,
        String speed) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.capacity = capacity;
        this.interfaceType = interfaceType;
        this.speed = speed;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nType: " + type +
            "\nCapacity: " + capacity +
            "\nInterface Type: " + interfaceType +
            "\nSpeed: " + speed;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public String getSpeed() {
        return speed;
    }
}
