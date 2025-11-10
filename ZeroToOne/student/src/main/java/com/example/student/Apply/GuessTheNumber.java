package com.example.student.Apply;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    Random num1 = new Random();

    /**
     * 判断数字大小
     */
    public static void Judge(int num1) {
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入数字：");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num > num1) {
                System.out.println("数字太大了");
            } else if (num < num1) {
                System.out.println("数字太小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println(num1);
    }

    public static void main(String[] args) {
        Judge(new Random().nextInt(100) + 1);
    }

}
