package Backjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {
    public static void main(String[] args) {
        // 스캐너로 입력 받기
        Scanner sc = new Scanner(System.in);

        //입력 받은 숫자를 변수에 할당
        BigInteger bigNumber1 = sc.nextBigInteger();
        BigInteger bigNumber2 = sc.nextBigInteger();

        // BigInteger 합 구하기
        BigInteger sum = bigNumber1.add(bigNumber2);

        // 출력
        System.out.println(sum);
    }
}
