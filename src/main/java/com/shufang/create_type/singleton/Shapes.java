package com.shufang.create_type.singleton;

/**
 * 这个一个枚举类，枚举类底层其实也是一种单例模式
 */
public enum Shapes {
    TRIANGLE("三角形", 3), CIRCLE("圆形", 1);

    // 定义枚举的属性
    private String name;
    private Integer lines;

    //定义枚举的构造器，在声明枚举常量的时候被调用
    Shapes(String name, Integer lines) {
        this.name = name;
        this.lines = lines;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ", lines=" + lines +
                '}';
    }
}

/**
 * 用来测试定义的枚举类
 */
class TestShapes {
    public static void main(String[] args) {

        /**
         * Shapes{name='三角形', lines=3}
         * com.shufang.create_type.singleton.Shapes
         */
        System.out.println(Shapes.TRIANGLE);

        System.out.println(Shapes.TRIANGLE.getClass().getName());
    }
}