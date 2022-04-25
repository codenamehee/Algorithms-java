package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 점의 개수
        int[][] numArr = new int[N][2]; // 점들을 기록할 2차원 배열

        StringBuilder sb = new StringBuilder();

        // 2차원 배열에 입력된 숫자들을 정렬
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2차원 배열 중 0열을 기준으로 오름차순 정렬하는데 이 때, i행 0열과 i+1행 0열이 같으면 각각의 1열의 원소들을 비교하라는 것이다.
        Arrays.sort(numArr, (e1, e2) -> {
            // 1차 행렬 형태인 e1, e2의 [0]번째 인덱스 즉, 0열의 원소들을 비교하여 같으면
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1]; // 1열의 원소를 비교한 결과값을 반환하라는 의미
            } else {
                return e1[0] - e2[0]; // 만약 앞의 원소가 더 크면 양수를, 같으면 0을, 작으면 음수를 반환하여 sort에서는 이 반환값들을 기준으로 인자들의 대소를 비교하게 된다.
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(numArr[i][0] + " " + numArr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
