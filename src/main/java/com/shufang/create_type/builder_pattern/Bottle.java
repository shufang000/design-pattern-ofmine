package com.shufang.create_type.builder_pattern;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "bottle packing(用杯子打包)";
    }
}
