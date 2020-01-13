package com.sethjava.factorymethod.product;

public class Iphone implements Mobile {

    @Override
    public String name() {
        return "Apple Iphone 11";
    }

    @Override
    public String description() {
        return "Shoot 4K videos, beautiful portraits, and sweeping landscapes with the all-new dual-camera " +
                "system. Capture your best low-light photos with Night mode. See true-to-life color in your " +
                "photos, videos, and games on the 6.1-inch Liquid Retina display.³ Experience unprecedented " +
                "performance with A13 Bionic for gaming, augmented reality (AR), and photography. Do more and " +
                "charge less with all-day battery life.² And worry less with water resistance up to 2 meters for " +
                "30 minutes.¹\n";
    }
}
