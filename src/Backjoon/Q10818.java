package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열의 크기인 첫째 줄에 주어진 정수 저장
        int N = Integer.parseInt(br.readLine());

        // 두번째 줄 잃어들여서 배열에 숫자 저장하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        StringBuilder result = new StringBuilder();

        for(int j=0; j<arr.length; j++) {
            if(arr[j] < min) {
                min = arr[j];
            }
            if(arr[j] > max){
                max = arr[j];
            }
        }
        result.append(min).append(' ').append(max);
        System.out.println(result);
    }
}