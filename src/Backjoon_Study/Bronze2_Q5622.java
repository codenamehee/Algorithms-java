package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_Q5622 {
    public static void main(String[] args) throws IOException {
        // 단어 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int result = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)>=65 && str.charAt(i) <=67) {
                result = result + 3;
            } else if (str.charAt(i)>=68 && str.charAt(i) <=70) {
                result = result + 4;
            } else if (str.charAt(i)>=71 && str.charAt(i) <=73) {
                result = result + 5;
            } else if (str.charAt(i)>=74 && str.charAt(i) <=76) {
                result = result + 6;
            } else if (str.charAt(i)>=77 && str.charAt(i) <=79) {
                result = result + 7;
            } else if (str.charAt(i)>=80 && str.charAt(i) <=83) {
                result = result + 8;
            } else if (str.charAt(i)>=84 && str.charAt(i) <=86) {
                result = result + 9;
            } else if (str.charAt(i)>=87 && str.charAt(i) <=90) {
                result = result + 10;
            }
        }
        System.out.println(result);
    }
}

// 숫자 1을 걸려면 2초가 걸리고 이후 1초씩 더 걸리므로
// 1부터 0까지 숫자를