package com.inkronsane.oop3.DataTier.HelperComponents;

import com.inkronsane.oop3.DataTier.price.Price;

public enum Webcam implements Price {
    LOGITECH_C920("Logitech C920", 80.0, "1080p", "30fps", "USB"),
    RAZER_KIYO("Razer Kiyo", 100.0, "1080p", "30fps", "Ring light"),
    MICROSOFT_LIFE_CAM_HD_3000("Microsoft LifeCam HD-3000", 25.0, "720p", "30fps",
        "Built-in microphone"),
    AVER_MEDIA_LIVE_STREAM_CAM_513("AVerMedia Live Stream Cam 513", 120.0, "1080p", "60fps",
        "Wide-angle lens"),
    ELGATO_FACE_CAM("Elgato FaceCam", 200.0, "1080p", "60fps", "USB Type-C");


    private final String name;
    private final double price;
    private final String resolution;
    private final String frameRate;
    private final String connectivity;

    Webcam(String name, double price, String resolution, String frameRate, String connectivity) {
        this.name = name;
        this.price = price;
        this.resolution = resolution;
        this.frameRate = frameRate;
        this.connectivity = connectivity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAllCharacteristics() {
        return "Name: " + name +
            "\nPrice: " + price +
            "\nResolution: " + resolution +
            "\nFrame Rate: " + frameRate +
            "\nConnectivity: " + connectivity;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public String getConnectivity() {
        return connectivity;
    }
}
