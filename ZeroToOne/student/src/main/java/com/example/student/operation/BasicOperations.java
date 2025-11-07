package com.example.student.operation;

import static com.example.student.foundation.NumberType.DoubleNumber;

/**
 * 基础运算符
 * 两个数之间的运算
 * + 加
 * - 减
 * * 乘
 * / 除
 */
public class BasicOperations {

    /**
     * 两个数相加
     *
     * @param double1
     * @param double2
     * @return
     */
    public static double Add(double double1, double double2) {
        DoubleNumber(double1);
        DoubleNumber(double2);
        return DoubleNumber(double1 + double2);
    }

    /**
     * 两个数相减
     *
     * @param double1
     * @param double2
     * @return
     */
    public static double Sub(double double1, double double2) {
        DoubleNumber(double1);
        DoubleNumber(double2);
        return DoubleNumber(double1 - double2);
    }

    /**
     * 乘法
     *
     * @param double1
     * @param double2
     * @return
     */
    public static double Mul(double double1, double double2) {
        DoubleNumber(double1);
        DoubleNumber(double2);
        return DoubleNumber(double1 * double2);
    }

    /**
     * 除法
     *
     * @param double1
     * @param double2
     * @return
     */
    public static double Div(double double1, double double2) {
        if (double2 == 0) {
            // 返回无穷大或特定值，而不是抛出异常
            return Double.NaN;
        } else {
            DoubleNumber(double1);
            DoubleNumber(double2);
            return DoubleNumber(double1 / double2);
        }
    }

    /**
     * 取余数
     *
     * @param int1
     * @param int2
     * @return
     */
    public static int Mod(int int1, int int2) {
        return int1 % int2;
    }

    public static void main(String[] args) {
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
        System.out.println("Add: " + Add(Math.PI, Math.E));
        System.out.println("Sub: " + Sub(Math.PI, Math.E));
        System.out.println("Mul: " + Mul(Math.PI, Math.E));
        System.out.println("Div: " + Div(Math.PI, Math.E));
        System.out.println("Div: " + Div(Math.PI, 0));
        System.out.println("Mod: " + Mod(10, 3));
    }
}
