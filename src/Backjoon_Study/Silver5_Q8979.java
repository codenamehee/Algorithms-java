package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_Q8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st, st1; // br의 값들을 한 줄의 문자열로 읽어 공백을 기준으로 쪼개기 위한 stringtokenizer의 선언

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] countryResult = new int[N][4];
//        int country, gold, silver, bronze;

        for (int i=0; i<N; i++) {
            st1 = new StringTokenizer(br.readLine());
            countryResult[i][0] = Integer.parseInt(st1.nextToken());
            countryResult[i][1] = Integer.parseInt(st1.nextToken());
            countryResult[i][2] = Integer.parseInt(st1.nextToken());
            countryResult[i][3] = Integer.parseInt(st1.nextToken());
        }

        // 배열의 1열의 숫자가 높은 순서대로 정렬하고
        for (int i=0; i < N; i++) {
            for (int j=0; j<N-j; j++) {
                if (countryResult[j][1] > countryResult[j+1][1]) {
                    int tmp = countryResult[j][1];
                    countryResult[j][1] = countryResult[j+1][1];

                }
            }
        }
    }


}

// 풀이
// 1. N과 K를 입력받는다.
// 2. 이후로 주어지는 나라의 번호, 금, 은, 동 메달의 갯수를 배열에 저장한다.
// 3. 나라의 인덱스와 해당 나라의 등수를 저장하는 배열을 하나 만든다.
// 4. 배열의 [i][1] 번째 항목인 금메달의 갯수를 비교하여 그 수가 가장 큰 순서대로 다른 배열에 저장한다.
// 5. 금, 은 동메달의 갯수를 비교하여 각 메달의 갯수가 큰 순서대로 등수를 높게 할당하고, 만약 세 개의 갯수가 같을 경우 같은 등수를 부여한다.
// 6. 3번 배열에서 k번째 국가의 등수를 출력한다.