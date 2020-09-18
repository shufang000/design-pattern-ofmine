package com.shufang.create_type.builder_pattern;

public class Pepsi extends ColdDrinking {
    @Override
    public String name() {
        return "百事可乐";
    }



    @Override
    public Double price() {
        return 5.12d;
    }
}
