package Backjoon;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Q11654 {
    public static void main(String[] args) {
        // 값 입력
        Scanner sc = new Scanner(System.in);
        // 입력된 값을 문자열로 받기. 스캐너는 바로 char로 값을 받을 수 없음
        String a = sc.nextLine();

        // (1) 한 개의 문자 -> 아스키코드로 출력하는 방법
        // 문자열을 문자로 형변환
//        char b = a.charAt(0);
        // 문자를 아스키코드로 출력하기 위해 int형으로 변환
//        int c = b;

        // (2) 문자열 -> 아스키코드로 출력하는 방법
        byte[] bytes = a.getBytes(StandardCharsets.US_ASCII);

//        System.out.println(c);
        System.out.println(bytes[0]);
    }
}
