package com.shufang.create_type.builder_pattern;

//具体是汉堡Buger的实体类
public class NonVegBuger extends Buger {
    @Override
    public String name() {
        return "非素食汉堡";
    }


    @Override
    public Double price() {
        return 20.68d;
    }
}
