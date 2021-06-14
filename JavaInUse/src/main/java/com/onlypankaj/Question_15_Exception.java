package com.onlypankaj;

public class Question_15_Exception {
    public static void proceed() throws Exception1 {
        try {
            throw new RuntimeException("JavaInUse Rocks");
        } catch (Exception e) {
            throw new Exception2(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Question_15_Exception.proceed();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Exception1 extends Exception {
    public Exception1(String s) {
        super(s);
    }
}

class Exception2/* line l1 */ extends Exception1{
    public Exception2(String s) {
        super(s);
    }
}