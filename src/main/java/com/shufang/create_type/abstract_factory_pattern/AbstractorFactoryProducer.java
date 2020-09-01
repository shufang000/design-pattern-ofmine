package com.shufang.create_type.abstract_factory_pattern;

public class AbstractorFactoryProducer {

    static AbstractFactory factory = null;

    public static AbstractFactory getFactory(String category) {
        if (category.equalsIgnoreCase("color")) {
            factory = new ColorFactory();
        } else if (category.equalsIgnoreCase("shape")) {
            factory = new ShapeFactory();
        }

        return factory;
    }
}
