package Backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st, st1;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st1 = new StringTokenizer(br.readLine());

        int a;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<n; i++) {
            a = Integer.parseInt(st1.nextToken());

            if (a < x) {
                list.add(a);
            }
        }

        for (int j=0; j<list.size(); j++) {
            bw.write(list.get(j) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
