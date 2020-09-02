package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class StaticInnerHolderSingleton {

    //1 私有化构造器
    private StaticInnerHolderSingleton() {
        System.out.println("inited");
    }

    //创建静态内部类,这个成员的初始化也是延迟加载的，只有在调用的时候会装载该内部类
    private static class Holder {
        static final StaticInnerHolderSingleton INSTANCE = new StaticInnerHolderSingleton();
    }

    //获取实例
    public static StaticInnerHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }


    /**
     * 测试实例的创建
     * inited,构造器只被调用一次
     * com.shufang.create_type.allsingletons.StaticInnerHolderSingleton@be30631
     * ......
     * @param args
     */
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(StaticInnerHolderSingleton.getInstance());
                }
            });
        }
        pool.shutdownNow();
    }

}
