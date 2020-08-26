package com.shufang.create_type.abstractFactoryPattern;

public abstract class DigitalFactory {
    public abstract Phone createPhone();
    public abstract Pad createPad();
    public abstract PC createPC();
}
