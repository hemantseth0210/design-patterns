package com.sethjava.abstractfactory;

import com.sethjava.abstractfactory.factory.FourGMobileFactory;
import com.sethjava.abstractfactory.factory.MobileFactory;
import com.sethjava.abstractfactory.factory.ThreeGMobileFactory;
import com.sethjava.abstractfactory.product.Apple;
import com.sethjava.abstractfactory.product.Samsung;

public class Main {

    public static void main(String[] args) {
        MobileFactory mobileFactory = new ThreeGMobileFactory();
        Samsung samsung = mobileFactory.createSamsungMobile();
        Apple apple = mobileFactory.createApplePhone();
        System.out.println(samsung.getName());
        System.out.println(apple.getName());

        mobileFactory = new FourGMobileFactory();
        samsung = mobileFactory.createSamsungMobile();
        apple = mobileFactory.createApplePhone();
        System.out.println(samsung.getName());
        System.out.println(apple.getName());
    }
}
