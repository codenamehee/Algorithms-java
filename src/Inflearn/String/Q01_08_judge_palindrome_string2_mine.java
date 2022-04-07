package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_08_judge_palindrome_string2_mine {
    public String solution(String str) {
        String onlyChars = str.replaceAll("[^a-zA-Z]", "");

        int len = onlyChars.length();

        for (int i=0; i<len/2; i++) {
            if (onlyChars.charAt(i)!=onlyChars.charAt(len-i-1)) {
                return "NO";
            }
        }
        return "YES";
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        Q01_08_judge_palindrome_string2_mine T = new Q01_08_judge_palindrome_string2_mine();
        System.out.print(T.solution(str));
    }
}
