package com.jacob.thread;

/**
 * @author Jacob Suen
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        MyThread myThreadB = new MyThread();
        myThreadA.setName("ThreadA");
        myThreadB.setName("ThreadB");
//        myThreadA.run();
//        myThreadB.run();
        myThreadA.start();
        myThreadB.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(getName() + ":" + i);
        }
    }
}