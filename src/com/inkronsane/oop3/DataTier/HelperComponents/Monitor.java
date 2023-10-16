package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Monitor implements Price {
    DELL_U2718Q("Dell U2718Q", 300.0, "27-inch", "4K Ultra HD", "IPS, 60Hz"),
    ASUS_VG279Q("ASUS VG279Q", 350.0, "27-inch", "Full HD", "IPS, 144Hz, FreeSync"),
    AOC_Q32V3("AOC Q32V3", 250.0, "31.5-inch", "QHD", "VA, 75Hz"),
    LG_27GL83A("LG 27GL83A", 400.0, "27-inch", "QHD", "IPS, 144Hz, G-Sync Compatible"),
    SAMSUNG_CRG9("Samsung CRG9", 900.0, "49-inch", "Dual QHD", "VA, 120Hz");


    private final String name;
    private final double price;
    private final String displaySize;
    private final String resolution;
    private final String panelType;

    Monitor(String name, double price, String displaySize, String resolution, String panelType) {
        this.name = name;
        this.price = price;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.panelType = panelType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nDisplay Size: " + displaySize +
            "\nResolution: " + resolution +
            "\nPanel Type: " + panelType;
    }


    public String getName() {
        return name;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getResolution() {
        return resolution;
    }

    public String getPanelType() {
        return panelType;
    }
}
