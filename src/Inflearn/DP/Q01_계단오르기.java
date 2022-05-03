package Inflearn.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lengthOfStairs = Integer.parseInt(br.readLine());
        int[] result = new int[lengthOfStairs + 1];
        // 0부터 시작하는 배열의 인덱스에서 주어진 계단의 개수에 해당하는 인덱스 번호의 값을 얻기 위해서는
        // 배열의 크기가 주어진 계단의 수 + 1이어야 한다.

        result[1] = 1;
        result[2] = 2;

        for (int i = 3; i <= lengthOfStairs; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        System.out.println(result[lengthOfStairs]);
    }
}
