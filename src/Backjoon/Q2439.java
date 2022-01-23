package Backjoon;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i=1; i<=n; i++) {
            for (int l=1; l<=n-i; l++) {
                bw.write(' ');
            }

            for (int j=1; j<=i; j++) {
                bw.write(star);
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
