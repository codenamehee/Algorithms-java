package Inflearn.String;

import java.util.Scanner;

public class Q01_01_find_number_T {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // 그냥 for문 사용
//        for (int i = 0; i<str.length(); i++) {
//            if (str.charAt(i)==t) {
//                answer++;
//            }
//        }

        // 향상된 for문 사용(for-each)
        for(char x : str.toCharArray()) {
            if (x==t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Q01_01_find_number_T T = new Q01_01_find_number_T();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}
