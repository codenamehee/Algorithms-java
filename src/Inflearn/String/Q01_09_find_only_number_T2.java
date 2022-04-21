package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_09_find_only_number_T2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 아스키 코드값을 이용하기
        // 숫자는 48 - 57 => 0 - 9
        String answer = "";

        // char는 정수형으로 저장된다.
        for (char x : br.readLine().toCharArray()) {
            // Character.isDigit => 숫자인지 아닌지 boolean형으로 출력한다.
            if (Character.isDigit(x)) {
                answer = answer + x;
            }
        }
        System.out.println(Integer.parseInt(answer));

    }
}