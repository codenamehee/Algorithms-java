package Backjoon;

import java.util.Scanner;

public class Q2558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 중간에 스캐너 객체를 한번 더 생성하여 입력을 받았더니 오류가 났다.

//        Scanner sc2 = new Scanner(System.in);
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);
    }
}
