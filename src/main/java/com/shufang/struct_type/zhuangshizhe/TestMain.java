package com.shufang.struct_type.zhuangshizhe;

public class TestMain {
    public static void main(String[] args) {

        /**
         * 奶茶	5
         * 金桔奶茶	8
         * 珍珠金桔奶茶	13
         * 椰果珍珠金桔奶茶	16
         */
        //一杯原味奶茶
        MilkTea milkTea = new MilkTea();
        System.out.println(milkTea.getName() + "\t" + milkTea.price());

        //一杯金桔原味奶茶
        JinJu jinJu = new JinJu(new MilkTea());
        System.out.println(jinJu.getName() + "\t" + jinJu.price());

        //一杯珍珠金桔原味奶茶
        ZhenZhu zhenZhu = new ZhenZhu(jinJu);
        System.out.println(zhenZhu.getName() + "\t" + zhenZhu.price());


        //一杯椰果珍珠金桔原味奶茶
        YeGuo yeGuo = new YeGuo(zhenZhu);
        System.out.println(yeGuo.getName() + "\t" + yeGuo.price());


    }
}
