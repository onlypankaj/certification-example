package com.onlypankaj;

class MyFirstResource implements AutoCloseable {
    public MyFirstResource() {
        System.out.println("Constructor -> MyFirstResource");
    }

    public void doSomething() {
        System.out.println("Something -> MyFirstResource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed -> MyFirstResource");
    }
}

class MySecondResource implements AutoCloseable {
    public MySecondResource() {
        System.out.println("Constructor -> MySecondResource");
    }

    public void doSomething() {
        System.out.println("Something -> MySecondResource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed -> MySecondResource");
    }
}

public class Question4_AutoCLoseable {
    public static void main(String args[]) throws Exception {
        try (MyFirstResource mr1 = new MyFirstResource(); MySecondResource mr2 = new MySecondResource())      {
            mr1.doSomething();
            mr2.doSomething();
        }
    }
}