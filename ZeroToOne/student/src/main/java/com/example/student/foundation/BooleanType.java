package com.example.student.foundation;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BooleanType {
    /**
     * 布尔类型
     * boolean 1位 true/false
     */
    @NotNull
    @Contract(pure = true)
    public static String Boolean(boolean boolean1) {
        return boolean1 ? "true" : "false";
    }
    public static void main(String[] args) {
        System.out.println(Boolean(true));
        System.out.println(Boolean(false));
    }
}
