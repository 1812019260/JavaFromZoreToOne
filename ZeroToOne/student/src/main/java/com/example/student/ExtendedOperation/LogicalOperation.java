package com.example.student.ExtendedOperation;

/**
 * 逻辑运算
 * & 逻辑与 真真则真
 * | 逻辑或 真假则真
 * ^ 逻辑异或 真假则真, 真真则假
 * ~ 逻辑非 假则真
 * && 短路逻辑与 假则假, 真则真
 * || 短路逻辑或 真则真, 假则假
 * ! 逻辑非 假则真, 真则假
 * 逻辑运算符的优先级高于关系运算符
 */
public interface LogicalOperation {
    public static String LogicalAnd(boolean boolean1, boolean boolean2) {
        return boolean1 && boolean2 ? "true" : "false";
    }
}
