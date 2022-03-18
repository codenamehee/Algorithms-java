package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_02_change_alphabet_format_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] charArr = str.toCharArray();

        for (int i=0; i<charArr.length; i++) {
            if (Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            } else if (Character.isLowerCase(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        String result = new String(charArr); // 109ms 소요
//        String result = String.valueOf(charArr); // 113ms 소요

        System.out.println(result);

        br.close();
    }
}

// 입력된 문자열 중에서 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하기
// 먼저 입력된 문자열들을 한 글자씩 쪼개며 해당 문자가 대문자인지 소문자인지 파악한다.
// 대문자면 소문자로 소문자면 대문자로 바꾸어 배열에 저장한 후, 출력한다.