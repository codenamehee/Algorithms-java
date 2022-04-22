package Inflearn.String;

import java.util.Scanner;

public class Q01_10_the_shortest_distance_between_chars_mine_with_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        char t = sc.next().charAt(0);
        int[] result = new int[arr.length];

        int distance = 1000; // 어떤 문자로부터 거리의 초기값

        // 첫번째 for문 - 왼쪽에서 오른쪽으로 돌며 t로부터의 위치를 확인하는 for문
        for (int i=0; i<arr.length; i++) {
            // 영어 소문자 아스키 코드 범위 값 : 97 - 122 => (a - z)
            if (arr[i] == t) {
                distance = 0;
                result[i] = distance;
            } else {
                distance = distance + 1;
                result[i] = distance;
            }
        }

        // 두번째 for문 - 오른쪽에서 왼쪽으로 돌며 t로부터의 거리를 기입하는 for문
        // 이 때, 위에서 입력된 distance 값보다 작을경우 바꾸어 입력한다.
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == t) {
                distance = 0;
            } else {
                distance = distance + 1;
                if (result[i] > distance) {
                    result[i] = distance;
                }
                // 강사님은 위의 if문 대신 result[i] = Math.min(result[i], p) 로 대체!! 알아두기
            }
        }

        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
