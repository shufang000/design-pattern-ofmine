package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程安全的懒汉式单例模式
 * 延迟加载
 * 线程安全
 * 懒汉式
 * NOTE：懒汉式没有将方法加synchronized修饰的会有线程安全问题
 */
public final class SafeLazySingleton {

    private static SafeLazySingleton safeLazySingleton;

    private SafeLazySingleton() {
        System.out.println("inited");
    }

    public static synchronized SafeLazySingleton getInstance() {
        if (safeLazySingleton == null) {
            safeLazySingleton = new SafeLazySingleton();
        }
        return safeLazySingleton;
    }

    public static void main(String[] args) {

        //创建固定数量线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SafeLazySingleton.getInstance());
                }
            });
        }
        pool.shutdownNow();
    }
}
