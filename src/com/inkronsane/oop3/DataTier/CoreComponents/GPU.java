package com.inkronsane.oop3.DataTier.CoreComponents;


import com.inkronsane.oop3.DataTier.price.Price;

public enum GPU implements Price {
    NVIDIA_GEFORCE_RTX_3060("NVIDIA GeForce RTX 3060", 400.0, "PCIe 4.0", "12GB GDDR6", "192-bit",
        "170W"),
    NVIDIA_GEFORCE_RTX_3070("NVIDIA GeForce RTX 3070", 500.0, "PCIe 4.0", "8GB GDDR6", "256-bit",
        "220W"),
    NVIDIA_GEFORCE_RTX_3080("NVIDIA GeForce RTX 3080", 700.0, "PCIe 4.0", "10GB GDDR6X", "320-bit",
        "320W"),
    NVIDIA_GEFORCE_RTX_3090("NVIDIA GeForce RTX 3090", 1500.0, "PCIe 4.0", "24GB GDDR6X", "384-bit",
        "350W"),
    AMD_RADEON_RX_6700("AMD Radeon RX 6700 XT", 450.0, "PCIe 4.0", "12GB GDDR6", "192-bit", "230W"),
    AMD_RADEON_RX_6800("AMD Radeon RX 6800", 600.0, "PCIe 4.0", "16GB GDDR6", "256-bit", "250W"),
    AMD_RADEON_RX_6900("AMD Radeon RX 6900 XT", 700.0, "PCIe 4.0", "16GB GDDR6", "256-bit", "300W"),
    NVIDIA_GEFORCE_GT_1030("NVIDIA GeForce GT 1030", 100.0, "PCIe 3.0", "2GB GDDR5", "64-bit",
        "30W");

    private final String name;
    private final double price;
    private final String interfaceType;
    private final String memoryCapacity;
    private final String memoryBus;
    private final String powerConsumption;

    GPU(String name, double price, String interfaceType, String memoryCapacity, String memoryBus,
        String powerConsumption) {
        this.name = name;
        this.price = price;
        this.interfaceType = interfaceType;
        this.memoryCapacity = memoryCapacity;
        this.memoryBus = memoryBus;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nInterface Type: " + interfaceType +
            "\nMemory Capacity: " + memoryCapacity +
            "\nMemory Bus: " + memoryBus +
            "\nPower Consumption: " + powerConsumption;
    }


    public String getName() {
        return name;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public String getMemoryBus() {
        return memoryBus;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }
}
