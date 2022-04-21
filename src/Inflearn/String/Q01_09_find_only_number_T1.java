package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_09_find_only_number_T1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 아스키 코드값을 이용하기
        // 숫자는 48 - 57 => 0 - 9
        int answer = 0;

        // char는 정수형으로 저장된다.
        for (char x : br.readLine().toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer*10 + (x-48);
            }
        }
        System.out.println(answer);

    }
}