package com.shufang.create_type.builder_pattern;

/**
 * 建造者模式很常见：
 *      Java中的StringBuilder.append.append.append => StringBuilder
 *      Spark中的SparkSession.builder().conf().conf()
 *      .....
 * 这些都是建造者模式，在创建复杂对象的同时可以控制创建细节
 */
//用来创建不同的套餐组合
public class MealBuilder {

    // 创建一个素食套餐
    public Meal createVegMeal(){
        Meal meal = new Meal();

        return meal;
    };

    // 创建一个非素食套餐
    public Meal createNonVegMeal(){
        Meal meal = new Meal();
        return meal;
    };

}


