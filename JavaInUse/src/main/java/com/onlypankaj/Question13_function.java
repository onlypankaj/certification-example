package com.onlypankaj;

interface MyInterface {
    void calculate();
}

public class Question13_function {
    public static void main(String[] args) {
        MyInterface obj = () -> {
            int i = 22;
            i++;
            System.out.println(i);
            return;
        };
        obj.calculate();
    }
}
