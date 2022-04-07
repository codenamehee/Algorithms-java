package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_07_judge_palindrome_string_T {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 대소문자 구분하지 않으므로 모두 대문자로 치환
        String str = br.readLine().toUpperCase();

        // 문자열의 길이가 짝수이거나 홀수일 때 모두 상관없이
        // 총 인덱스의 중앙값 까지만 대칭되는 문자와의 일치 여부 판단을 반복하도록 for문 작성
        // 예시) 0번째 인덱스는 문자열의 맨 마지막 문자와의 일치 여부를 비교하게 되고
        //      1번째 인덱스는 문자열의 끝에서 두번째 문자와 일치 여부를 비교하게 된다.

        // 처음부터 답변은 무조건 yes라고 가정한 뒤
        String answer = "YES";

        // 회문 문자열인지 아닌지 판별
        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)) {
                answer = "NO";
            }
        }
        // for문 안에서 if문을 만족하지 않았을 경우 answer은 yes로 유지된다.
        System.out.println(answer);
    }
}