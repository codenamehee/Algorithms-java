package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 주어지는 과목 수 저장
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 과목 점수 배열 생성
        float[] arr = new float[n];

        // 배열에 과목 점수 할당
        for (int i=0; i<n; i++) {
            arr[i] = Float.parseFloat(st.nextToken());
        }

        // 과목 점수 중 최댓값 찾기
        float M = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (M < arr[i]) {
                M = arr[i];
            }
        }

        float sum = 0;
        for (int i=0; i < arr.length; i++) {
            arr[i] = arr[i]/M*100;
            sum = sum + arr[i];
        }
        float medium = sum/n;
        System.out.println(medium);
    }
}
