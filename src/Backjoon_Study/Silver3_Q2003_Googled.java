package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver3_Q2003_Googled {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()); // StringTokenizer.trim() : 문자열의 앞 뒤 공백을 제거해준다.

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] numsArr = new int[N];
        for (int i = 0; i < N; i++) {
            numsArr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int count = 0; // 경우의 수
        int starterPnt = 0;
        int endPnt = 0;

        while (true) {
            if (sum >= M) {

                sum = sum - numsArr[starterPnt]; // 두 줄을 합친 코드 => sum = sum - numsArr[starterPnt++];
                starterPnt = starterPnt + 1;
            } else if (endPnt > N-1) {
                break;
            } else {
                sum = sum + numsArr[endPnt];
                endPnt = endPnt + 1;
            }
            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
