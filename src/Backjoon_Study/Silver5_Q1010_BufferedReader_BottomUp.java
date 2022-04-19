package Backjoon_Study;

import java.util.Arrays;
import java.util.Scanner;

public class Silver5_Q1010_BufferedReader_BottomUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dp = new int[30][30];

        // n==r, r==0 => nCr=1
        for (int i=0; i<30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i=2; i<30; i++) {
            for (int j=1; j<30; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
//                System.out.print(dp[i][j]);
            }
//            System.out.println();
        }

        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            sb.append(dp[M][N]).append('\n');
        }
        System.out.println(sb);
    }
}
// 백준 통과

// 풀이 방법 - 조합의 성질을 이용하기
// 배열을 생성하고 재귀를 이용하여 배열에 값이 있으면 그 값을 이용하고
// 값이 없으면 조합의 성질 1과 2를 이용하여 값을 도출해낸다.