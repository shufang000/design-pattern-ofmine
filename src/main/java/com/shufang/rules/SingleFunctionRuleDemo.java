package com.shufang.rules;

/**
 * 本类主要解释=> 类的单一职责原则
 * 单一职责原则的使用注意事项：
 * 1）降低类的复杂度，一个类只负责一项职责
 * 2）提高类的可读性，可维护性
 * 3）降低变更引起的风险
 * 4）注意：通常情况下，我们应该遵循单一职责原则，只有逻辑足够简单，才可以在代码级别违反单一职责原则；
 *    在【类】中方法比较少的情况下，我们可以只在【方法级别】保证单一职责原则
 *
 * TODO 记住：单一职责并不代表一个类只有一个方法，假如有订单、用户2个不同模块的类
 * class User{}  只负责用户层面相关功能的职责
 * class Order{} 只负责订单层面相关功能的职责
 */
public class SingleFunctionRuleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        /** 方案一
         * 摩托车 is running on the road !~
         * 汽车 is running on the road !~
         * 飞机 is running on the road !~  飞机不能在公路上跑吧
         * @违反了单一职责原则   =>  方案二
         */
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");


        /**
         * 方案二
         * 飞机 is flying in the sky !~
         * @遵循了【类级别】&【方法级别】单一职责原则，但是创建了3个不同的类，成本太高 => 方案三
         */
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.run("飞机");


        /**
         * 方案三
         * 汽车 is running on the road !~
         * 飞机 is running on the road !~
         * 轮船 is floating on the water !~
         * @这个方案没有对原来的类做大的修改，只是增加方法
         * @在【方法级别】遵循单一职责原则，但是在【类级别】没有遵循单一职责原则
         */
        Vehicle02 vehicle02 = new Vehicle02();
        vehicle02.run("汽车");
        vehicle02.runAir("飞机");
        vehicle02.runWater("轮船");
    }
}


//方案一
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road !~");
    }
}


//方案二
class SkyVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying in the sky !~");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is floating on the water !~");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road !~");
    }
}


//方案三
class Vehicle02 {

    // 慎用 if else if else .....else ，尽量用不同的方法、或者类将不同的分支隔离开
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road !~");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " is running on the road !~");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " is floating on the water !~");
    }
}




