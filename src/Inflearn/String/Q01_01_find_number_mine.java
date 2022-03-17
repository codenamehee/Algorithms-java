package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Q01_01_find_number_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase(Locale.ROOT);
        String ch = br.readLine().toLowerCase(Locale.ROOT);

        char[] charArr = str.toCharArray();

        int count = 0;
        for (int i=0; i<charArr.length; i++) {
            if (ch.charAt(0)==charArr[i]) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
