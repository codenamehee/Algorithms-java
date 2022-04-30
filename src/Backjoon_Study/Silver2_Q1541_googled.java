package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_Q1541_googled {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer forAddition = new StringTokenizer(st.nextToken(), "+");

            while (forAddition.hasMoreTokens()) {
                temp = temp + Integer.parseInt(forAddition.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
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