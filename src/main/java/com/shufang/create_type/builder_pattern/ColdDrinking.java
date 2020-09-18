package com.shufang.create_type.builder_pattern;

public abstract class ColdDrinking implements Item {


    //是要是冷饮，都用杯子bottle来进行打包
    @Override
    public Packing pack() {
        return new Bottle();
    }
}
