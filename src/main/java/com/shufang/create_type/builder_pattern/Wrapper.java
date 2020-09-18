package com.shufang.create_type.builder_pattern;

// 具体的打包方式
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper packing(用包装纸打包)";
    }
}
