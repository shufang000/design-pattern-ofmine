package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * double-check lock
 */
public class DCLSingleton {
    //使用volatile关键字开启线程之间的内存可见性，但是不支持原子性，
    private volatile static DCLSingleton dclSingleton;

    private DCLSingleton() {
        System.out.println("inited");
    }

    public static DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }

        return dclSingleton;
    }

    /**
     * 测试该创建是否为单例模式
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(DCLSingleton.getInstance());
                }
            });
        }
        pool.shutdownNow();
    }



}
