package com.shufang.create_type.allsingletons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1、延迟加载
 * 2、线程不安全
 * 3、懒汉式
 */
public class NotSafeLazySingleton {

    private static NotSafeLazySingleton notSafeLazySingleton;

    private NotSafeLazySingleton() {
        System.out.println("initailizing");
    }

    public static NotSafeLazySingleton getInstance() {
        if (notSafeLazySingleton == null) {
            notSafeLazySingleton = new NotSafeLazySingleton();
        }
        return notSafeLazySingleton;
    }

    public static void main(String[] args) {

        /**
         * initailizing
         * initailizing
         * initailizing
         * initailizing
         * com.shufang.create_type.allsingletons.NotSafeLazySingleton@6419af39
         * com.shufang.create_type.allsingletons.NotSafeLazySingleton@b20b63
         * com.shufang.create_type.allsingletons.NotSafeLazySingleton@6419af39
         * com.shufang.create_type.allsingletons.NotSafeLazySingleton@6419af39
         * TODO 构造器被调用了4次，说明在多线程的情况下，构造器被调用了4次
         */
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 1; i < 50; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(NotSafeLazySingleton.getInstance());
                }
            });

            pool.shutdownNow();
        }
    }


}
