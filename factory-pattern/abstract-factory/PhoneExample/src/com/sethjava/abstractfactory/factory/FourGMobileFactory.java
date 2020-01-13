package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.product.Apple;
import com.sethjava.abstractfactory.product.Iphone4G;
import com.sethjava.abstractfactory.product.Samsung;
import com.sethjava.abstractfactory.product.Samsung4G;

public class FourGMobileFactory implements MobileFactory {
    @Override
    public Samsung createSamsungMobile() {
        return new Samsung4G();
    }

    @Override
    public Apple createApplePhone() {
        return new Iphone4G();
    }
}
