package com.shufang.create_type.abstractFactoryPattern;

public class AppleFactory extends DigitalFactory {
    public Phone createPhone() {
        return new Iphone();
    }

    public Pad createPad() {
        return new Ipad();
    }

    public PC createPC() {
        return new MacBook();
    }
}
