package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 枚举可以实现单例模式，而且代码简介，但是目前不太常用
 */
enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("inited");
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        /**
         * inited  构造器只被调用了一次
         * com.shufang.create_type.allsingletons.EnumSingleton
         * com.shufang.create_type.allsingletons.EnumSingleton
         */
        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(EnumSingleton.INSTANCE.getClass().getName());
                }
            });
        }
        pool.shutdownNow();
    }

}
