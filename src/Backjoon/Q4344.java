package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());

            int sum = 0;
            int medium = 0;
            int[] arr = new int[N];
            double rate = 0;

            for (int j=0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum = sum + arr[j];
            }
            medium = sum/N;

            int student = 0;
            for (int j=0; j < N; j++) {
                if (arr[j] > medium) {
                    student = student + 1;
                }
            }
            rate = ((double)student/(double)N)*100;
            sb.append(String.format("%.3f", rate)).append("%").append('\n');
        }
        System.out.println(sb);
    }
}
