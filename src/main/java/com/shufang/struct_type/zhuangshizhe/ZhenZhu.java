package com.shufang.struct_type.zhuangshizhe;

public class ZhenZhu extends ZhuangShiZhe {

    public ZhenZhu(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "珍珠" + tea.getName();
    }

    @Override
    public int price() {
        return 5 +tea.price();
    }
}
