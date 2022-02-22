package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder st = new StringBuilder();

        for (int i=0; i < N; i++) {
            String testCase = br.readLine();
            int score = 0;
            int sum = 0;
            for (int j=0; j < testCase.length(); j++) {
                if (testCase.charAt(j) == 'O') {
                    score = score + 1;
                    sum = sum + score;
                } else if (testCase.charAt(j) == 'X') {
                    score = 0;
                }
            }
            st.append(sum).append('\n');
        }
        System.out.println(st);
    }
}

// 풀이 방법
// 배열에 테스트 케이스를 넣고