package com.example.student.foundation;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NumberType {
    /**
     * 1. 整数类型
     * byte 8位 -128至127
     * short 16位 -32768至32767
     * int 32位 -2147483648至2147483647
     * long 64位 -9223372036854775808至9223372036854775807
     **/
    public static void Integer(byte byte1, short short1, int int1, long long1) {
        byte num1;
        short num2;
        int num3;
        long num4;
        num1 = byte1;
        num2 = short1;
        num3 = int1;
        num4 = long1;
        System.out.println("byte: " + num1);
        System.out.println("short: " + num2);
        System.out.println("int: " + num3);
        System.out.println("long: " + num4);
    }

    /**
     * 浮点数类型
     * float 32位 7位有效数字
     * double 64位 15位有效数字
     */
    public static void FloatingNumber(float float1, double double1) {
        float num1;
        double num2;
        num1 = float1;
        num2 = double1;
        System.out.println("float: " + num1);
        System.out.println("double: " + num2);
        System.out.printf("float: %.2f%n", num1);
        System.out.printf("double: %.2f%n", num2);
    }

    /**
     *
     * @param double1
     * @return 返回两位小数
     */
    @NotNull
    @Contract(pure = true)
    public static double DoubleNumber(double double1) {
        return Math.round(double1 * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Integer((byte) 0, (short) 32767, 2147483647, 9223372036854775807L);
        FloatingNumber(3.1413f, 0.13865);
        System.out.println("double: " + DoubleNumber(0.13865));
    }
}
