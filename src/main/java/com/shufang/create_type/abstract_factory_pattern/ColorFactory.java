package com.shufang.create_type.abstract_factory_pattern;

public class ColorFactory extends AbstractFactory {

    Color type ;

    // 如果是ColorFactory，只需要实现并重写重要的getColor()方法
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            type = new Red();
        } else if (color.equalsIgnoreCase("green")) {
            type = new Green();
        }
        return type;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
