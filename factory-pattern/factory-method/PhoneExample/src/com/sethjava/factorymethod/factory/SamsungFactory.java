package com.sethjava.factorymethod.factory;

import com.sethjava.factorymethod.product.Mobile;
import com.sethjava.factorymethod.product.Samsung;

public class SamsungFactory implements MobileFactory {
    @Override
    public Mobile createMobile() {
        return new Samsung();
    }
}
