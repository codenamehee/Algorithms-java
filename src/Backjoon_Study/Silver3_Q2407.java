package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Silver3_Q2407  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == m) {
            System.out.println(1);
        } else {
            BigInteger result = BigInteger.valueOf(factorial(n) / factorial(n-m) * factorial(m));
            System.out.println(result);
        }
    }

    static long factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
