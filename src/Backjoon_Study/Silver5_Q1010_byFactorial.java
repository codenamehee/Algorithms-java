package Backjoon_Study;

import java.math.BigInteger;
import java.util.Scanner;

public class Silver5_Q1010_byFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long result = factorial(m) / (factorial(n) * factorial(m-n));

            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }

    static long factorial(int N) {
        if (N==0) {
            return 1;
        }
        return N * factorial(N-1);
    }
}

// 마지막 3번째 케이스에서 int타입의 범위를 넘어가버린다. => 다시 구현하기

// 풀이 방법 - 조합의 성질을 이용하기
// 배열을 생성하고 재귀를 이용하여 배열에 값이 있으면 그 값을 이용하고
// 값이 없으면 조합의 성질 1과 2를 이용하여 값을 도출해낸다.