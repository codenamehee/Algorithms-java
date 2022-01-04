package Backjoon;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        // for 문을 반복할 변수 및 합계값을 넣을 변수 선언
        int a;
        int sum = 0;

        // 값 입력
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        // 반복문 실행 : i부터 a까지 합을 구한다.
        for(int i=1; i<= a; i++) {
            sum = sum + i;
        }

        // 결과 출력
        System.out.println(sum);
    }
}
