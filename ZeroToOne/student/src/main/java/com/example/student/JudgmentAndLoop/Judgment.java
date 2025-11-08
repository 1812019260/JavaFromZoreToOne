package com.example.student.JudgmentAndLoop;

import java.util.Scanner;

public class Judgment {
    public static void main(String[] args) {
        ifElse();
        switchCase();
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

    private static void switchCase() {
        System.out.println("请输入星期:");
        Scanner scanner = new Scanner(System.in);
        String week = scanner.next();
        switch (week) {
            case "1":
                System.out.println("周一");
                break;
            case "2":
                System.out.println("周二");
                break;
            case "3":
                System.out.println("周三");
                break;
            case "4":
                System.out.println("周四");
                break;
            case "5":
                System.out.println("周五");
                break;
            case "6":
                System.out.println("周六");
                break;
            case "7":
                System.out.println("周日");
                break;
            default:
                System.out.println("输入错误");
        }
    }

}
