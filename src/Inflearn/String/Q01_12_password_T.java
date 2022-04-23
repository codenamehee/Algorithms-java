package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_12_password_T {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String answer = "";

        for (int i=0; i<N; i++) {
            String subStr = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(subStr, 2);
            answer+=(char)num;
            str = str.substring(7);
        }
        System.out.println(answer);
    }
}