package com.shufang.struct_type.zhuangshizhe;


public abstract class Tea {
    private String name = "茶";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int price();
}
