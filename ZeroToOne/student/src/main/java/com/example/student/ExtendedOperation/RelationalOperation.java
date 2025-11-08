package com.example.student.ExtendedOperation;

/**
 * 关系运算符
 * == 相等
 * != 不相等
 * > 大于
 * < 小于
 * >= 大于等于
 * <= 小于等于
 */
public class RelationalOperation {
    public String Equivalent(int int1, int int2) {
        if (int1 == int2) {
            return "相等";
        } else {
            return "不相等";
        }
    }

    public String Compare(int int1, int int2) {
        if (int1 > int2) {
            return "大于";
        } else if (int1 < int2) {
            return "小于";
        }
        return "等于";
    }

    public static void main(String[] args) {
        System.out.println(new RelationalOperation().Equivalent(1, 2));
        System.out.println(new RelationalOperation().Compare(1, 2));
    }
}