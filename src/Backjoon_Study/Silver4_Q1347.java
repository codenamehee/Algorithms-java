package Backjoon_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver4_Q1347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String journey = br.readLine();

        // 문제 풀이에 필요한 변수들 생성
        String direction = "Bottom"; //화살표 상태
        char[][] result = new char[N+1][N+1]; // 내용을 기록할 2차원 배열. 좌표처럼 역할

        int line = (N+1)/2; // 행 값
        int row = (N+1)/2; // 열 값

        for (int i = 0; i < N; i++) {
            if (direction.equals("Bottom")) {
                if (journey.charAt(i) == 'L') {
                    direction = "Left";
                } else if (journey.charAt(i) == 'R') {
                    direction = "Right";
                } else if (journey.charAt(i) == 'F') {
                    direction = "Bottom";
                    result[line][row] = '.';
                    row = row - 1; // y축으로 -1 이동
                }
            } else if (direction.equals("Left")) {
                if (journey.charAt(i) == 'L') {
                    direction = "Top";
                } else if (journey.charAt(i) == 'R') {
                    direction = "Bottom";
                } else if (journey.charAt(i) == 'F') {
                    direction = "Left";
                    result[line][row] = '.'; // 현재 배열 위치의 원소를 '.'으로 채우기
                    line = line - 1; // x축으로 -1 이동
                }
            } else if (direction.equals("Right")) {
                if (journey.charAt(i) == 'L') {
                    direction = "Bottom";
                } else if (journey.charAt(i) == 'R') {
                    direction = "Top";
                } else if (journey.charAt(i) == 'F') {
                    direction = "Right";
                    result[line][row] = '.'; // 현재 배열 위치의 원소를 '.'으로 채우기
                    line = line + 1; // x축으로 1 이동
                }
            } else if (direction.equals("Top")) {
                if (journey.charAt(i) == 'L') {
                    direction = "Left";
                } else if (journey.charAt(i) == 'R') {
                    direction = "Right";
                } else if (journey.charAt(i) == 'F') {
                    direction = "Top";
                    result[line][row] = '.'; // 현재 배열 위치의 원소를 '.'으로 채우기
                    row = row + 1; // y축으로 1 이동
                }
            }
            if (i==(N-1)) {
                result[line][row] = '.';
            }
        }

        int a, b, c, d = 0; // 가로와 세로 길이를 찾기 위한 좌표 변수 4개
        int width, height = 0; // 가로, 세로 길이를 담을 변수

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
