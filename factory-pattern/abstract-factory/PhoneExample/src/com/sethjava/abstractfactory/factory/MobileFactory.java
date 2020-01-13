package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.product.Apple;
import com.sethjava.abstractfactory.product.Samsung;

public interface MobileFactory {
    Samsung createSamsungMobile();
    Apple createApplePhone();
}
