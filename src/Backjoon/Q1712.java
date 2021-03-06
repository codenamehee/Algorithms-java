package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 고정비용
        int B = Integer.parseInt(st.nextToken()); // 가변비용
        int C = Integer.parseInt(st.nextToken()); // 노트북 가격

        // 정답 코드
        if (C <= B) {
            System.out.println(-1);
        } else {
            System.out.println((A/(C-B))+1);
        }

        // 내가 짠 코드
//        if ( ((A / (C-B))==0 || (A / (C-B))<0) && (C-B)!=0 ) {
//            System.out.println(-1);
//        } else {
//            if (A % (C-B)==0) {
//                System.out.println(A/(C-B)+1);
//            } else {
//                System.out.println((A/(C-B)) + 1);
//            }
//        }
    }
}
