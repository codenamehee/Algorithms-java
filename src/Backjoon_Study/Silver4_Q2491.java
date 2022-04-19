package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_Q2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1;

        int count = 1;
        for (int i=0; i<N-1; i++) {
            if (arr[i] <= arr[i+1]) {
                count = count + 1;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        int count2 = 1;
        for (int i=0; i<N-1; i++) {
            if (arr[i] >= arr[i+1]) {
                count2 = count2 + 1;
            } else {
                count2 = 1;
            }
            max = Math.max(max, count2);
        }
        System.out.println(max);
    }
}
