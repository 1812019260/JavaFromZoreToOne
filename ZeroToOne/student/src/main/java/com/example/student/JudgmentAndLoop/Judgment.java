package com.example.student.JudgmentAndLoop;

import java.util.Scanner;

public class Judgment {
    public static void main(String[] args) {
        ifElse();
    }

    private static void ifElse() {
//        请输入年龄:
        System.out.println("请输入年龄:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }
    }
}
