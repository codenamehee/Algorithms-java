package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_Q2231_googled {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 분해합이 N이 되는 자연수 중 가장 작은 자연수 찾기

        int result = 0;

        for (int i=0; i<N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while(number!=0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
