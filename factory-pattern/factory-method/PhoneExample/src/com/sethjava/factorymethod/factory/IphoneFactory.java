package com.sethjava.factorymethod.factory;

import com.sethjava.factorymethod.product.Iphone;
import com.sethjava.factorymethod.product.Mobile;

public class IphoneFactory implements MobileFactory {
    @Override
    public Mobile createMobile() {
        return new Iphone();
    }
}
