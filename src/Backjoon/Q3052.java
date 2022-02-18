package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 나머지를 저장하는 배열
        Integer[] arr = new Integer[10];

        for (int k=0; k < arr.length; k++) {
            arr[k] = Integer.parseInt(br.readLine()) % 42;
        }

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set.size());

//        <같은 알고리즘을 사용한 다른 코드>
//        HashSet<Integer> h = new HashSet<Integer>();
//
//        for (int i=0; i < 10; i++) {
//            h.add(Integer.parseInt(br.readLine()) % 42);
//        }
//        System.out.println(h.size());
    }
}

// 해결 방법
// 먼저, 어떤 수를 42로 나눴을 때 나올 수 있는 나머지는 0부터 41까지이다. => 총 42개
// 0부터 41까지의 숫자가 있는 배열을 하나씩 만든다.
// 앞2577에서 풀었던 방법처럼 입력된 각 숫자를 받아 아스키 코드로 변환한 뒤, 48을 빼주고 길이 42 배열에
// 나머지 숫자만큼 인덱스를 주어 1씩 올린다.
// 배열을 탐색하면서 0이 아닌 배열의 숫자가 몇 개인지 출력한다.