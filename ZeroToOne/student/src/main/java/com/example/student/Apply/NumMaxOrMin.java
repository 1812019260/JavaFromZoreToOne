package com.example.student.Apply;

/**
 * 输入一个数组,找出最大值和最小值
 */
public class NumMaxOrMin {
    //输入数组:
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("最大值: " + getMax(array));
        System.out.println("最小值: " + getMin(array));
    }

    /**
     * 获取数组中的最大值
     * @param array 输入数组
     * @return 数组中的最大值
     */
    public static int getMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 获取数组中的最小值
     * @param array 输入数组
     * @return 数组中的最小值
     */
    public static int getMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
