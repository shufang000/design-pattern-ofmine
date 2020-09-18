package com.shufang.struct_type.zhuangshizhe;

public class HongDou extends ZhuangShiZhe {

    public HongDou(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "红豆" + tea.getName();
    }

    @Override
    public int price() {
        return 2 + tea.price();
    }
}
