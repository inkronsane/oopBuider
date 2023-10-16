package com.inkronsane.oop3.DataTier.CoreComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum RAM implements Price {
    KINGSTON_HYPERX_16GB("Kingston HyperX 16GB DDR4 RAM", 79.99, "DDR4", "16GB", "3200MHz"),
    CORSAIR_VENGEANCE_32GB("Corsair Vengeance 32GB DDR4 RAM", 129.99, "DDR4", "32GB", "3600MHz"),
    G_SKILL_TRIDENT_Z_64GB("G.Skill Trident Z 64GB DDR4 RAM", 199.99, "DDR4", "64GB", "4000MHz"),
    HYPERX_IMPACT_8GB("HyperX Impact 8GB DDR4 RAM", 49.99, "DDR4", "8GB", "2666MHz"),
    CRUCIAL_BALLISTIX_32GB("Crucial Ballistix 32GB DDR4 RAM", 109.99, "DDR4", "32GB", "3000MHz"),
    TEAMGROUP_T_FORCE_XCALIBUR_RGB_16GB("TeamGroup T-Force Xcalibur RGB 16GB DDR4 RAM", 89.99,
        "DDR4", "16GB", "3600MHz"),
    PATRIOT_VIPER_STEEL_8GB("Patriot Viper Steel 8GB DDR4 RAM", 54.99, "DDR4", "8GB", "3200MHz"),
    SAMSUNG_32GB("Samsung 32GB DDR4 RAM", 119.99, "DDR4", "32GB", "2666MHz"),
    CORSAIR_DOMINATOR_PLATINUM_64GB("Corsair Dominator Platinum 64GB DDR4 RAM", 249.99, "DDR4",
        "64GB", "3600MHz"),
    CORSAIR_VALUE_SELECT_4GB("Corsair Value Select 4GB DDR4 RAM", 29.99, "DDR4", "4GB", "2133MHz");

    private final String name;
    private final double price;
    private final String type;
    private final String capacity;
    private final String speed;

    RAM(String name, double price, String type, String capacity, String speed) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.capacity = capacity;
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

    public String getSpeed() {
        return speed;
    }
}
