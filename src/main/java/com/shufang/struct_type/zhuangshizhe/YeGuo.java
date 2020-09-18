package com.shufang.struct_type.zhuangshizhe;

public class YeGuo extends ZhuangShiZhe {

    public YeGuo(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "椰果" + tea.getName();
    }

    @Override
    public int price() {
        return 3 + tea.price();
    }
}
