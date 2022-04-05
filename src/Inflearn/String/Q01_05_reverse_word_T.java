package Inflearn.String;

import java.io.IOException;
import java.util.Scanner;

public class Q01_05_reverse_word_T {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray(); // answer에 대한 문자 배열이 생성되는 메소드
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s); // valueOf : 인자를 string화 시켜주는 static 메소드

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Q01_05_reverse_word_T T = new Q01_05_reverse_word_T();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
