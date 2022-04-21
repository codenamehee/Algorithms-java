package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bronze2_Q2231_mine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 분해합이 N이 되는 자연수 중 가장 작은 자연수 찾기

        int sumOfNums = 0;
        int needSum = 0;
        int share;
        int remainder = N;
        ArrayList<Integer> resultArr = new ArrayList<>();

        while(true) {
            int lengthOfN = String.valueOf(N).length();

            // 각 자리 숫자의 합 구하기
            for (int j=0; j<=lengthOfN-1; j++) {
                share = remainder / (int)Math.pow(10,lengthOfN-1-j);
                remainder = remainder % (int)Math.pow(10,lengthOfN-1-j);
                sumOfNums = sumOfNums + share;
            }

            if (needSum==sumOfNums) {
                resultArr.add(Integer.valueOf(N));
            }

            N = N - 1;
            remainder = N;
            needSum++;
            sumOfNums = 0;

            if (N==1) {
                break;
            }
        }

        if (resultArr.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(resultArr));
        }
    }
}

// 분해합은 자연수 + 각 자리수의 합
// 생성자는 어떤 자연수 + 자연수의 각 자리수의 합이 생성자가 되는 어떤 자연수
// 각 자리수의 합을 구하는 방법
// 자연수를 각각 100의 자리, 10의 자리 등으로 나눈 나머지의 합이 각 자리수의 합이 된다.


//        int lengthOfN = nString.length();
//        int N = Integer.parseInt(nString);
//
//        int decompose = N; // 분해합 담을 변수
//        char[] nChar = nString.toCharArray(); // 배열을 생성하지 않고 바로 한글자씩 정수형으로 변환해서 합 구할 수 있는 코드 고민하기
//
//        // 분해합 완성 코드
//        for (int i=0; i<nString.length(); i++) {
//            decompose = decompose + Character.getNumericValue(nChar[i]);
//        }