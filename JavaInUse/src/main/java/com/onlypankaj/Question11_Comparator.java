package com.onlypankaj;

import java.util.Comparator;

public class Question11_Comparator {
    public static void main(String args[]) {

        Comparator<String> comparator  = new Comparator<>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        System.out.println(comparator.compare("Test123","Test"));
    }
}
