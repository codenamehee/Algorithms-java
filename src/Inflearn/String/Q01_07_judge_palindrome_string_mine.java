package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_07_judge_palindrome_string_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
