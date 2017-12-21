package com.hzr;

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

    }
}
