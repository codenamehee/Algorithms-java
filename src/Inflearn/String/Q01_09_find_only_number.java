package Inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_09_find_only_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 아스키 코드값을 이용하기
        // 숫자는 48 - 57 => 0 - 9
        char[] arr = br.readLine().toCharArray();
        StringBuilder st = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            if ((arr[i] >= 48) && (arr[i] <= 57)) {
                st.append(arr[i]);
            }
        }

        if (String.valueOf(st).startsWith("0")) {
            st.deleteCharAt(0);
        }

        int result = Integer.parseInt(String.valueOf(st));
        System.out.println(result);
    }
}

// 1. 주어진 문자열을 입력받고 charArray로 만든다.
// 2. charArray를 차례로 탐색하면서 48 - 57 사이의 값들인 것만 문자열에 하나씩 추가한다.
//    만약 위 과정에서 첫번째 숫자의 값이 48이면 문자열에 추가하지 않는다.