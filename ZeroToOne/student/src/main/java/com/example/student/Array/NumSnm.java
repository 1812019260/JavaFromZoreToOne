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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 更改数组的顺序
     * @param arr
     */
    public static void reverseArrayOrder(@NotNull int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     *打乱顺序
     * @param arr
     */
    public static void shuffleArray(@NotNull int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // 创建类实例后调用非静态方法
        NumSnm numSnm = new NumSnm();
        int[] result = numSnm.numSnm();

        // 正确打印数组内容
        System.out.println(Arrays.toString(result));
        countElements(numSnm.arr);
        changeArrayData(numSnm.arr);
        reverseArrayOrder(numSnm.arr);
        shuffleArray(numSnm.arr);
    }
}
