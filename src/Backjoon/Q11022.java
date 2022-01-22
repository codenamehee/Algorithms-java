package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int a;
        int b;
        int sum;

        for (int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
