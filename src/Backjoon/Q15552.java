package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws IOException {

        // BufferReader와 BufferWriter를 이용한 입출력 문제

        // BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 제일 첫번째 값인 t 읽어오기
        int t = Integer.parseInt(br.readLine());

        // 두 정수 a, b 읽어오기
        for (int i=0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
