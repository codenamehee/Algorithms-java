package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver4_Q2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st, st1;
        st = new StringTokenizer(br.readLine());

        int trafficLightCnt = Integer.parseInt(st.nextToken()); // 신호등 갯수
        int roadLen = Integer.parseInt(st.nextToken()); // 도로의 길이

        int[][] intArr = new int[trafficLightCnt][3];

        for (int i=0; i<trafficLightCnt; i++) {
            st1 = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                intArr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        int result = 0; // 결과로 출력할 시간
        for (int i=0; i<trafficLightCnt; i++) {
            if (i==0) {
                result = result + intArr[i][0];
            } else {
                result = result + (intArr[i][0] - intArr[i-1][0]);
            }
            while(true) {
                int mod = result % (intArr[i][1] + intArr[i][2]);
                if (mod < intArr[i][1]) {
                    result = result + intArr[i][1] - mod;
                    break;
                }
                else {
                    break;
                }
            }
        }
        result = result + roadLen - intArr[trafficLightCnt-1][0];
        System.out.println(result);
    }
}
