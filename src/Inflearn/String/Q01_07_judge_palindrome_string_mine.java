package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_07_judge_palindrome_string_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 대소문자를 구분하지 않으므로 모두 대문자로 변환
        String str = br.readLine().toUpperCase();

        int lt = 0, rt = str.length()-1;
        while (lt <= rt) {
            if (str.charAt(lt)==str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                System.out.println("NO");
                break;
            }
        }
        if (lt >= rt) {
            System.out.println("YES");
        }
    }
}
