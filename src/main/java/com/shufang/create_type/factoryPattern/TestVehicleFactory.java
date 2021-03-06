package com.shufang.create_type.factoryPattern;


/**
 * TODO 所属类型：创建类设计模式
 *
 * 工厂模式简介：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 *
 * 主要解决：主要解决接口选择的问题。
 *
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 *
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
 *
 * 注意事项：
 * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 * 有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。
 * 如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 */
public class TestVehicleFactory {
    public static void main(String[] args) {

        System.out.println(new VehicleFactory().vehicle);

        VehicleFactory vehicleFactory = new VehicleFactory();
        /**
         * null
         * Car is running fast~this is a benz
         * motor can be fast as a air plane in lilun
         * air plane is the fast vehicle in the world!~
         */
        vehicleFactory.getAVehicle(1).SignMsg();
        vehicleFactory.getAVehicle(2).SignMsg();
        vehicleFactory.getAVehicle(3).SignMsg();
    }
}
