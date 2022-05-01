package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_Q1541_googled {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; // 합계를 가장 큰 수로 초기화
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int temp = 0; // '-' 부호를 기준으로 쪼개진 문자열 내에 +로 묶인 숫자들이 있을 경우 이들의 합을 구하기 위한 변수

            StringTokenizer forAddition = new StringTokenizer(st.nextToken(), "+");

            // while문을 통해 +로 묶인 수들의 합 구하기
            while (forAddition.hasMoreTokens()) {
                temp = temp + Integer.parseInt(forAddition.nextToken());
            }

            // sum 변수가 초기값이면 맨 첫번째 값을 그대로 양수 형태로 넣어주고
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                // 초기 값이 아니라면 계속해서 temp를 빼준다.
                sum = sum - temp;
            }
        }
        System.out.println(sum);
    }
}

// 포인트 : 가장 큰 수를 빼주어야 한다.
// 풀이 과정
// 1. 문자열을 '-'기호를 기준으로 나누고
// 2. 나눈 문자열들의 원소들을 모두 더한다.
// 3. 첫번째 숫자만 빼고 다음 값들부터는 빼준다.