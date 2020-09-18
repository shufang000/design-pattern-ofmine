package com.shufang.create_type.abstract_factory_pattern;


/**
 * TODO 所属类型：创建型设计模式
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂，这个超级工厂是一个抽象类，如何通过工厂的FactoryProducer来生成一个工厂
 * 这种类型的设计模式属于创建型模式，提供了一种创建对象的最佳方式。
 *
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象
 * 抽象工厂模式相当于在简单工厂模式的模式上再进一步的做了封装
 * 1、通过传入工厂类型，使用工厂创造类创建对应的工厂实例；
 * 2、通过向工厂实例传入对应的对象信息，创造对应的对象实例，但是通过接口的形式进行抽象化
 *
 * TODO 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * TODO 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
