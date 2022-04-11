package Backjoon_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Silver5_Q8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());// br의 값들을 한 줄의 문자열로 읽어 공백을 기준으로 쪼개기 위한 stringtokenizer의 선언

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] countryResult = new int[N+1][4];
        int rank = 1;

        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            countryResult[index][0] = g;
            countryResult[index][1] = s;
            countryResult[index][2] = b;
        }

        for (int i=1; i<=N; i++) {
            if (countryResult[i][0] > countryResult[K][0]) {
                rank++;
            } else if (countryResult[i][0] == countryResult[K][0] && countryResult[i][1] > countryResult[K][1]) {
                rank++;
            } else if (countryResult[i][0] == countryResult[K][0] && countryResult[i][1] == countryResult[K][1] && countryResult[i][2] > countryResult[K][2]) {
                rank++;
            }
        }
        bw.write(String.valueOf(rank));
        bw.flush();
        br.close();
        bw.close();
    }
}

// 풀이
// 1. N과 K를 입력받는다.
// 2. 이후로 주어지는 나라의 번호, 금, 은, 동 메달의 갯수를 배열에 저장한다.
// 3. 나라의 인덱스와 해당 나라의 등수를 저장하는 배열을 하나 만든다.
// 4. 배열의 [i][1] 번째 항목인 금메달의 갯수를 비교하여 그 수가 가장 큰 순서대로 다른 배열에 저장한다.
// 5. 금, 은 동메달의 갯수를 비교하여 각 메달의 갯수가 큰 순서대로 등수를 높게 할당하고, 만약 세 개의 갯수가 같을 경우 같은 등수를 부여한다.
// 6. 3번 배열에서 k번째 국가의 등수를 출력한다.