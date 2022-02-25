package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 0) {
            System.out.println(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        } else if (N %5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}

// 풀이 방법
// 1. N킬로그램이 3과 5로 나누어 떨어지는지 확인한다.
// 2. 나누어 떨어지면 아래 로직을 시행하고 나누어 떨어지지 않으면 결과값으로 -1을 출력한다.
// 3. N을 5로 나눈 몫과 나머지를 따로 따로 저장한다.
// 4. 나머지를 다시 3으로 나눈 몫과 위에서 N을 5로 나눈 몫을 출력한다.