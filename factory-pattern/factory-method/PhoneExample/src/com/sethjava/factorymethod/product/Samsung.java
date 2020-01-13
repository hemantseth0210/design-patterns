package com.sethjava.factorymethod.product;

public class Samsung implements Mobile {
    @Override
    public String name() {
        return "Samsung Note 10+";
    }

    @Override
    public String description() {
        return "Enjoy a next-level entertainment and communication experience with this unlocked Samsung Galaxy " +
                "Note10+ smartphone. The quad HD+ Dynamic Infinity Display delivers crisp visuals while watching " +
                "movies, and the 4300 mAh battery offers up to 74 hours of audio playback time. This Samsung Galaxy " +
                "Note10+ smartphone has a pro-grade camera for capturing photos and videos of important moments, and " +
                "S Pen support provides accurate gesture functions.";
    }
}
