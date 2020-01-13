package com.sethjava.factorymethod;

import com.sethjava.factorymethod.factory.IphoneFactory;
import com.sethjava.factorymethod.factory.MobileFactory;
import com.sethjava.factorymethod.factory.SamsungFactory;
import com.sethjava.factorymethod.product.Mobile;

public class Client {

    public static void main(String[] args) {
        MobileFactory mobileFactory = new IphoneFactory();
        Mobile mobile = mobileFactory.createMobile();
        System.out.println("Seth Ordered 1st phone \n"+ mobile.name() + "\n"+mobile.description());

        System.out.println("########################");

        mobileFactory = new SamsungFactory();
        mobile = mobileFactory.createMobile();
        System.out.println("Seth Ordered 2nd phone \n"+ mobile.name() + "\n"+mobile.description());
    }
}
