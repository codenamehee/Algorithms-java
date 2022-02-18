package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        // 숫자 0의 아스키코드값인 48을 빼주면,
        // 'str.charAT[i]-48'의 값이 0인 경우 0, 1인 경우 1 이렇게 나오게 된다.
        // for문으로 arr 배열의 인덱스 숫자값을 차례대로 조회하며 48을 빼주고 arr[나머지]를 1씩 올려주면
        // arr이 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 까지 차례로 있다고 했을 때
        // 각 자리에 해당하는 숫자의 개수가 세어진다.
        for (int i=0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }

        // arr의 모든 값을 한번씩 출력해주면 된다.
        for (int v : arr) {
            System.out.println(v);
        }
    }
}
