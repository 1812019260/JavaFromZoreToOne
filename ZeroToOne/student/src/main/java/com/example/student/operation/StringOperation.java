package com.example.student.operation;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class StringOperation {
    /**
     * 字符串操作
     * 字符串相加
     * @return
     */
    @NotNull
    @Contract(pure = true)
    public static String Add(String string1, String string2) {
        return string1 + string2;
    }
    @NotNull
    public static String Sub(String string1, int int1){
        return  string1.repeat(int1);
    }
    public static void main(String[] args) {
        System.out.println(Add("hello ", " world"));
        System.out.println(Sub("hello ", 3));
    }
}
