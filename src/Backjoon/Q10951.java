package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException{

        // 풀이
        // 테스트 케이스가 끝날때까지 입력되어있는 테스트 케이스들을 한 줄씩 읽고
        // 읽어낸 줄에서 a와 b를 추출하여 합을 구한 뒤 변수에 저장해둔다.
        // 테스트 케이스가 더이상 존재하지 않을 경우 위의 과정은 종료되고, 아래의 과정이 수행된다.
        // 테스트 케이스의 행별 합을 한꺼번에 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sum = new StringBuilder();
        String str;
        StringTokenizer st;

        while( (str = br.readLine()) !=null ) {

            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum.append(a+b).append("\n");
        }
        System.out.println(sum);

        br.close();
    }
}
