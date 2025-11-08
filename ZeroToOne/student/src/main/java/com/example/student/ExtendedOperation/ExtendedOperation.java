package com.example.student.ExtendedOperation;

/**
 * 运算符扩展
 * +=
 * -=
 * *=
 * /=
 * %=
 */
public class ExtendedOperation {
    public static  Object[] Example(double double1, double double2, int int1, int int2) {
        double double3, double4;
        double1 += double2;
        double3 = double1;
        double1 -= double2;
        double4 = double1;
        int int3, int4, int5;
        int1 *= int2;
        int3 = int1;
        int1 /= int2;
        int4 = int1;
        int1 %= int2;
        int5 = int1;
        return new  Object[]{double3, double4, int3, int4, int5};
    }
    public static void main(String[] args) {
        Object[] result = Example(1.0, 2.0, 9, 4);
        System.out.println("double +=: " + result[0]);
        System.out.println("double -=: " + result[1]);
        System.out.println("int *=: " + result[2]);
        System.out.println("int /=: " + result[3]);
        System.out.println("int %=: " + result[4]);
    }
}
