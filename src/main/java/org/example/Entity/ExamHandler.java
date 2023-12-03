package org.example.Entity;

import java.util.Scanner;

public class ExamHandler {
    public void handleExam() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int point = scanner.nextInt();
                if (point < 50) {
                    throw new MyException("Unfortunately you didn't pass the exam");
                } else {
                    System.out.println("Welcome to PeakSoft");
                }
            } catch (MyException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
