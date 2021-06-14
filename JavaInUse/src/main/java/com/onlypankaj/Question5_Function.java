package com.onlypankaj;

import java.util.List;
import java.util.function.Function;

public class Question5_Function {
    public static void main(String[] args) {
        var data = List.of(5, 6, 8, 9);
        String s = null;
        // line l1
        Function<Integer, Integer> f = n->n*n;
        for (int a : data) {
            if (s != null) {
                s = s + (f.apply(a)) + " ";
            } else {
                s = (f.apply(a)) + " ";
            }
        }
        System.out.println(s);
    }
}
