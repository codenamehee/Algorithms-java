package Backjoon;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // 윤년 : 4의 배수 and 100의 배수가 아님, 또는 400의 배수
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("1");
            } else if (year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
