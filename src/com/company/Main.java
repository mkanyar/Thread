package com.company;

import org.w3c.dom.ls.LSOutput;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread");

        //create thread in the main function
        Thread anotherThread=new AnotherThread();
        anotherThread.start();
        //anonymous class
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the anonymous thread");
            }
        }.start();
        System.out.println(ANSI_PURPLE+"Hello from the main thread");
        //cant start it for the second time it will create an error
//        anotherThread.start();
    }
}
