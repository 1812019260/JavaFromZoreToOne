package com.example.student.foundation;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * 字符串类型
 * char 16位只有一个字符
 * String 16位多个字符最多65535个字符
 */
public class CharType {
    @NotNull
    @Contract(pure = true)
    public static String Varchar(char char1, String string1) {
        return char1 + "," + string1;
    }
    public static void main(String[] args) {
        System.out.println(Varchar('单', "hello"));
    }
}
