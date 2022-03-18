package Inflearn.String;

import java.io.*;

public class Q01_04_reverse_words_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb;
        String result;

        for (int i=0; i < n; i++) {
            String word = br.readLine();
            sb = new StringBuffer(word);
            result = sb.reverse().toString();
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
