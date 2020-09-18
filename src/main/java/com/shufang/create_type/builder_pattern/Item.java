package com.shufang.create_type.builder_pattern;

//抽象单品，如Item「汉堡、打包方式、汉堡价格」
public interface Item {
    String name();

    Packing pack();

    Double price();
}
