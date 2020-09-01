package com.shufang.create_type.abstract_factory_pattern;

public class TestAbstractFactory {
    public static void main(String[] args) {

        AbstractFactory colorFactory = AbstractorFactoryProducer.getFactory("color");

        System.out.println(colorFactory.getClass().getName());

        Color red = colorFactory.getColor("red");

        System.out.println(red.getClass().getName());

        red.draw();
    }
}
