package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();
        String Num = Integer.toString(a*b*c);

        char[] arr = new char[Num.length()];
        for(int k=0; k<Num.length(); k++) {
            arr[k] = Num.charAt(k);
        }

        for(int i=0; i<=9; i++) {
            int countI = 0;
            for(int j=0; j<Num.length(); j++) {
                if(i==Character.getNumericValue(arr[j])) {
                    countI++;
                }
            }
            result.append(countI).append('\n');
        }
        System.out.println(result);
    }
}
// 풀이 방법
// 1. 정수타입 변수에 A, B, C 값들의 곱을 대입한다.
// 2. 문자 타입으로 형변환하여 char 배열에 각 자리 수를 저장한다.
// 3. 배열을 탐색하면서 0부터 9까지의 숫자가 각각 몇 번 쓰였는지 저장하고, 그 결과를 한 줄에 하나씩 출력한다.