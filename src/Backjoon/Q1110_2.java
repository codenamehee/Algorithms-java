package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int copy = n;
        int cnt = 0;

        while (true) {
            n = ((n%10)*10) + (((n/10) + (n%10)) % 10);
            cnt = cnt + 1; // cnt++;

            if (copy == n){
                break;
            }
        }
        System.out.println(cnt);
    }
}
