package com.shufang.create_type.builder_pattern;

import java.util.ArrayList;

//这是一个事物套餐
public class Meal {
    //用来存储不同的套餐组成成员如：汉堡、可乐
    private ArrayList<Item> items = new ArrayList<Item>();

    //添加单品到套餐
    public Meal addItem(Item item) {
        items.add(item);
        System.out.println("item:" + item + " 添加成功");
        return this;
    }

    //获取当前套餐的总消费
    public Double getCost() {
        Double cost = 0D;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }


    //获取明细单品
    public void getItemList(){
        for (Item item : items) {
            System.out.println("单品名称："+item.name()+"，单品价格："+ item.price()+"，单品打包方式："+item.pack().pack());
        }
    }

}
