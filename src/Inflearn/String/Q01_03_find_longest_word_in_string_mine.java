//package Inflearn.String;
//
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Q01_03_find_longest_word_in_string_mine {
//    public String solution(String str) {
//        String result = "";
//        // 문장들을 공백을 기준으로 쪼개기
//        StringTokenizer st = new StringTokenizer(str, " ");
//
//        // 단어들의 길이를 담을 정수배열 선언
//        int[] intArr = new int[st.countTokens()];
//
//        // 쪼갠 단어들의 길이를 배열에 추가하기
//        for (int i=0; i < st.countTokens(); i++) {
//            int strLength = st.nextToken().length();
//            intArr[i] = strLength;
//        }
//
//        // 배열에서 가장 큰 값 찾아내기 & 큰 값이 여러개일 경우
//        int max = intArr[0];
//        for (int i=0; i < intArr.length; i++) {
//            if (intArr[i] > max) {
//                max = intArr[i];
//            }
//            // 여기에서 막혔다.... 길이가 긴 단어가 여러 개일 경우 어떻게 해야할까...?
////               intArr[i] > max 에서 크거나 같다가 아닌 그냥 크다라고 했을 때, 뒷쪽에서 똑같은 숫자가 나와도 순서는 앞쪽에서 유지된다...
////               기억하자!
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Q01_03_find_longest_word_in_string_mine T = new Q01_03_find_longest_word_in_string_mine();
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//        System.out.print(T.solution(str));
//    }
//}
//
//// it is too big
//// 0   1  2   3 => 배열의 인덱스이자 문자열에서 단어의 자리
////[2  2  3   3] => 단어의 길이를 저장하는 정수배열