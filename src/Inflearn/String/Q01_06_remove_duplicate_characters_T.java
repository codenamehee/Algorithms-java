package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_06_remove_duplicate_characters_T {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String answer = "";
        for (int i=0; i<str.length(); i++) {
            if (str.indexOf(str.charAt(i))==i) {
                answer = answer + str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
