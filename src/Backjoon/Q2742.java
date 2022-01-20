package Backjoon;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a;

        for (int i=n; i>=1; i--) {
            a = i;
            bw.write(a+"\n");
        }
        bw.close();
    }
}
