package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_11_compress_string_mine_withT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine() + " ";
        char[] strArr = s.toCharArray();

        String answer = "";
        int repeatNum = 1;

        for (int i=0; i<strArr.length -1; i++) {
            if (strArr[i] == strArr[i+1]) {
                repeatNum += 1;
            } else {
                answer = answer + strArr[i];
                if (repeatNum > 1) {
                    answer += repeatNum;
                }
                repeatNum = 1;
            }
        }
        System.out.println(answer);
    }
}
