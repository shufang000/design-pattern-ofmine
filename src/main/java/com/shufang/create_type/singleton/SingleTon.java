package com.shufang.create_type.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.omg.PortableServer.POAOperations;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public final class SingleTon {

    private SingleTon() {
        System.out.println("Initialized.");
    }


    private static final class SingleHolder {
        static final SingleTon singleTon = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingleHolder.singleTon;
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 50; i++) {
            pool.execute(new Runnable() {
                public void run() {
                    System.out.println(SingleTon.getInstance());
                }
            });
        }
        pool.shutdownNow();
    }
}
