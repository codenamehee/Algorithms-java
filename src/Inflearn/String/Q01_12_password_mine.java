package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_12_password_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i=0; i<7*N; i+=7) {
            String subStr = str.substring(i, i+7);

            for (int j = 0; j < subStr.length(); j++) {
                if (subStr.charAt(j) == '#') {
                    subStr = subStr.replace(subStr.charAt(j), '1');
                } else if (subStr.charAt(j) == '*') {
                    subStr = subStr.replace(subStr.charAt(j), '0');
                }
            }

            int demical = Integer.parseInt(subStr, 2);
            char resultChr = (char)demical;
            System.out.print(resultChr);
        }
    }
}

// 풀이과정
// 1. 입력된 문자열을 7개씩 끊기
// 2. #을 1로, *을 0으로 바꾸기
// 3. 2번 문자열을 10진수로 바꾸기
// 4. 아스키 번호에서 해당 10진수가 가리키는 알파벳을 합쳐서 출력한다.