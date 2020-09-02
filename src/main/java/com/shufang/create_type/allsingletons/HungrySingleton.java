package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 可能会产生垃圾对象
 * 饿汉式在调用该类的时候装载该实例属性,比较常用
 */
public final class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("inited");
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(HungrySingleton.getInstance());
                }
            });
        }
        pool.shutdownNow();

    }

}
