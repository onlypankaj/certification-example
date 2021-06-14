package com.onlypankaj;

import java.util.Optional;

public class Question3_OptionalNullable {
    public static void main(String[] args) {
        Optional<String> value = testVal();
        String str = value.orElse("JavaInUse");
        System.out.println(str);
    }

    private static Optional<String> testVal() {
        String s1 = null;
        return Optional.ofNullable(s1);
    }
}
