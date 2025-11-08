package com.example.student.Array;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class NumSnm {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /**
     * 数组累加
     *
     * @return 数组累加结果
     */
    public int[] numSnm() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return new int[]{sum};
    }

    /**
     * 统计元素个数
     * @param arr
     */
    public static void countElements(@NotNull int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        System.out.println("偶数个数：" + count);
    }

    /**
     * 改变数组中的数据
     * @param arr
     */
    public static void changeArrayData(@NotNull int[] arr) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        // 创建类实例后调用非静态方法
        NumSnm numSnm = new NumSnm();
        int[] result = numSnm.numSnm();

        // 正确打印数组内容
        System.out.println(Arrays.toString(result));
        countElements(numSnm.arr);
        changeArrayData(numSnm.arr);
    }
}
