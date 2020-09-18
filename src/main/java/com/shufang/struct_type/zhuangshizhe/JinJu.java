package com.shufang.struct_type.zhuangshizhe;

public class JinJu extends ZhuangShiZhe {

    public JinJu(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getName() {
        return "金桔" + tea.getName();
    }

    @Override
    public int price() {
        return 3 + tea.price();
    }
}
