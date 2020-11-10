package com.company;

import org.w3c.dom.ls.LSOutput;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread");

        //create thread in the main function
        Thread anotherThread=new AnotherThread();
        anotherThread.setName("--Another Thread--");
        //if we use the thread we created and then use .run it will run under the main thread. In other words it will run under the current main thread
        // Thus if we want it to run from a new thread we have to start it
        //anotherThread.run();
        anotherThread.start();
        //anonymous class
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the anonymous thread");
            }
        }.start();

        //pass the runnable implementation as a parameter
        Thread myRunnableThread=new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"hello from MyRunnable's implementation of run()");
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE+"Hello from the main thread");
        //cant start it for the second time it will create an error
//        anotherThread.start();
    }
}
