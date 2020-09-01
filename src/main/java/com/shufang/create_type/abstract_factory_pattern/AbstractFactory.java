package com.shufang.create_type.abstract_factory_pattern;


/**
 * TODO 所属类型：创建型设计模式
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂，这个超级工厂是一个抽象类，如何通过工厂的FactoryProducer来生成一个工厂
 * 这种类型的设计模式属于创建型模式，提供了一种创建对象的最佳方式。
 *
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
