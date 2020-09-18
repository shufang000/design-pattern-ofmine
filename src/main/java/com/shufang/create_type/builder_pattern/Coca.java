package com.shufang.create_type.builder_pattern;

public class Coca extends ColdDrinking {
    @Override
    public String name() {
        return "可口可乐";
    }



    @Override
    public Double price() {
        return 5.00d;
    }
}
