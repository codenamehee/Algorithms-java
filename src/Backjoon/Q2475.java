package Backjoon;

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        // 스캐너로 값 입력 받기
        Scanner sc = new Scanner(System.in);

        // 입력된 값들(String타입)을 Integer클래스의 pasreInt 메소드를 사용하여 Int로 변환
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());

        // 검증수 추출
        // 각 수의 제곱의 합을 10으로 나눈 나머지
        int lastNum = (a*a + b*b + c*c + d*d + e*e) % 10;

        System.out.println(lastNum);
    }
}
