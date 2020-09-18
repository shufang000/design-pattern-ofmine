package com.shufang.create_type.builder_pattern;

public class TestCreatePatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        //创建一个素食汉堡+可口可乐套餐
        Meal meal = mealBuilder.createVegMeal().addItem(new VegBuger()).addItem(new Coca());

        //创建一个肉食汉堡+百事可乐套餐
        Meal meal1 = mealBuilder.createNonVegMeal().addItem(new NonVegBuger()).addItem(new Pepsi());


        /** 输出结果如下：
         * 23.88
         * 单品名称：素食汉堡，单品价格：18.88，单品打包方式：wrapper packing(用包装纸打包)
         * 单品名称：可口可乐，单品价格：5.0，单品打包方式：bottle packing(用杯子打包)
         * ----------------
         * 25.8
         * 单品名称：非素食汉堡，单品价格：20.68，单品打包方式：wrapper packing(用包装纸打包)
         * 单品名称：百事可乐，单品价格：5.12，单品打包方式：bottle packing(用杯子打包)
         */
        System.out.println(meal.getCost());
        meal.getItemList();

        System.out.println("----------------");
        System.out.println(meal1.getCost());
        meal1.getItemList();

    }
}
