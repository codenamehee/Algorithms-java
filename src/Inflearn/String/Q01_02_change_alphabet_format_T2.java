package Inflearn.String;

import java.util.Scanner;

public class Q01_02_change_alphabet_format_T2 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x>=97 && x<=122) {
                answer = answer + (char)(x-32);
            } else {
                answer = answer + (char)(x+32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_02_change_alphabet_format_T2 T = new Q01_02_change_alphabet_format_T2();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.print(T.solution(str));
    }
}

// 입력된 문자열 중에서 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하기
// 먼저 입력된 문자열들을 한 글자씩 쪼개며 해당 문자가 대문자인지 소문자인지 파악한다.
// 대문자면 소문자로 소문자면 대문자로 바꾸어 배열에 저장한 후, 출력한다.