package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
    public static void main(String[] args) throws IOException {

        //tem : 각 자리의 숫자를 더한 값, num : 새로운 수
        int tem;
        int num = 0;
        int cycle = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        // 첫번째 줄에 주어진 n 저장 (0<= n =<99)
        int n = Integer.parseInt(br.readLine());
//        System.out.println(n);

        if (n==0) {
            cycle = 1;
            result.append(cycle);
            System.out.println(result);
        } else {

            tem = (n/10) + (n%10);
            num = (n%10)*10 + (tem%10);
            cycle = cycle + 1;

            while (n!=num) {
                tem = (num/10) + (num%10);
                num = (num%10)*10 + (tem%10);
                cycle = cycle + 1;
            }
            result.append(cycle);
            System.out.println(result);
        }
        br.close();
    }
}

// 풀이 방법
// 주어진 N을 저장한다.
// 주어진 수가 10보다 작은 경우와 큰 경우로 나누어 로직을 짠다.
// 1) 주어진 수가 0일 경우 => 새로운 수는 0이고 사이클의 길이는 0이다.
// 2) 주어진 수가 10보다 작은 경우 => 새로운 숫자 = 주어진 수*2가 된다.
// => if n=7 => num = 14 => 7 + 4 = 11 => 4 + 1 = 5 => 10, 11 => 1 =>
// 3) 주어진 수가 10보다 큰 경우
// 각 자리의 수를 더한다.
// 주어진 수의 일의 자리 수를 십의 자리 숫자로, 합의 일의자리 숫자를 일의 자리 숫자로 넣어 새로운 수를 만든다.
// 새로운 수가 N과 같아질 때까지 위의 과정을 반복하고 새로운 숫자가 만들어진 횟수를 출력한다.
