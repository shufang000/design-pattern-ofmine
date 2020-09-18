package com.shufang.create_type.builder_pattern;

public class VegBuger extends Buger {
    @Override
    public String name() {
        return "素食汉堡";
    }


    @Override
    public Double price() {
        return 18.88d;
    }
}
