package com.shufang.create_type.abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {

    Shape type = null;

    @Override
    public Color getColor(String color) {
        return null;
    }

    //如果是ShapeFactory，只需要重写getShape的主要方法
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            type = new Circle();
        } else if (shape.equalsIgnoreCase("triangle")) {
            type = new Triangle();
        }
        return type;
    }
}
