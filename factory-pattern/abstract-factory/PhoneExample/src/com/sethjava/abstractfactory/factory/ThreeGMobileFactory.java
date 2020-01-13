package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.product.*;

public class ThreeGMobileFactory implements MobileFactory {
    @Override
    public Samsung createSamsungMobile() {
        return new Samsung3G();
    }

    @Override
    public Apple createApplePhone() {
        return new Iphone3G();
    }
}
