package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int[] arr = new int[9];

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int index = 0;

        for(int j=0; j<arr.length; j++) {
            if(arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }
        result.append(max).append('\n').append(index+1);
        System.out.println(result);
    }
}
