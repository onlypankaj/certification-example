package com.onlypankaj;

public class Question9_innerClass {
    public static int calculate(int x) {
        int y = 4;
  /*       class Stock {
            int value(int x) {
               return x + y++;
            }
        }
        Stock stock = new Stock();
        return stock.value(x);*/
        return y; //dummy
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
}