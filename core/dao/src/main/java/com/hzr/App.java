package com.hzr;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("test");
        new Thread(){
            @Override
            public void run() {
                System.out.println("Thread");
            }
        }.start();

        System.out.println("test 服务器更改");

        for (int i = 0; i < 100; i++) {
            System.err.println("i :"+ i);
        }
        System.out.println("1212");
        BlockingQueue blockingQueue = new ArrayBlockingQueue(12);
         System.out.println("我QQ无");
    }
}
