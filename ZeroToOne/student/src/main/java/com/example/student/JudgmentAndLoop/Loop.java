package com.example.student.JudgmentAndLoop;

public class Loop {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("for loop end");
    }

    public static void whileLoop() {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("while loop end");
    }
    public static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("do while loop end");
    }
}
