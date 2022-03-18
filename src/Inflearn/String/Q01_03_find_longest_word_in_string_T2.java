package Inflearn.String;

import java.util.Scanner;

public class Q01_03_find_longest_word_in_string_T2 {
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Q01_03_find_longest_word_in_string_T2 T = new Q01_03_find_longest_word_in_string_T2();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}

// 입력된 문자열 중에서 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하기
// 먼저 입력된 문자열들을 한 글자씩 쪼개며 해당 문자가 대문자인지 소문자인지 파악한다.
// 대문자면 소문자로 소문자면 대문자로 바꾸어 배열에 저장한 후, 출력한다.