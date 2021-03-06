package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver5_Q1010_BufferedReader {
    static int[][] arr = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(combi(m, n)).append('\n');
        }
        br.close();
        System.out.println(sb);
    }

    // 아래 메서드에 static을 붙이면 안붙였을 때보다 성능이 훨씬 향상된다.
    // 메서드 호출시간이 짧아지기 때문이다 => static이 없는 메서드는 실행 시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하다.
    static int combi(int m, int n) {
        if (arr[m][n] > 0) {
            return arr[m][n];
        }

        if (m==n || n==0) {
            return arr[m][n] = 1;
        }

        return combi(m-1, n-1) + combi(m-1, n);
    }
}
// 백준 시간초과

// 풀이 방법 - 조합의 성질을 이용하기
// 배열을 생성하고 재귀를 이용하여 배열에 값이 있으면 그 값을 이용하고
// 값이 없으면 조합의 성질 1과 2를 이용하여 값을 도출해낸다.