package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수 t 할당
        int t = Integer.parseInt(br.readLine());

        // StringTokenizer타입의 변수 생성
        // for 문 안에서 반복적으로 StringTokenizer을 생성하면 메모리에 반복되는 횟수만큼 공간이 할당되므로 for문 밖에서 선언해주기
        StringTokenizer st;

        // 반복문을 통해 reader로부터 읽어들이기
        for (int i=1; i<=t; i++) {
            String ab = br.readLine();

            // 나란히 있는 a, b를 공백을 기준으로 읽어들이기 위해 stringtokenizer 생성
            st = new StringTokenizer(ab);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;

            // bufferedwriter를 통해 a+b출력하기
            bw.write("Case #" + i + ": " + sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
