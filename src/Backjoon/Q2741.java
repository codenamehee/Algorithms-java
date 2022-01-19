package Backjoon;

import java.io.*;

public class Q2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a;

        for(int i=1; i <= n; i++) {
            a = i;
            bw.write(a + "\n");
        }
        bw.close();
    }
}
