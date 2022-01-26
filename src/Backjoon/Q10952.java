package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int a, b;

        do {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a+b !=0) {
                bw.write(a+b + "\n");
            }

        } while (a!=0 && b!=0);

        br.close();
        bw.flush();
        bw.close();
    }
}
