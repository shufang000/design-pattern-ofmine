package com.shufang.create_type.builder_pattern;

//单品的具体实现之一、汉堡，这是一个抽象类，已经继承了接口的抽象方法，不需要实现
public abstract class Buger implements Item{

    //重写打包方法，只要是汉堡，都用包装纸打包，这是所有汉堡公共的，如果到子类实现的话，需要每个具体实例都要实现一遍该方法
    @Override
    public Packing pack() {
        return new Wrapper();
    }


}
