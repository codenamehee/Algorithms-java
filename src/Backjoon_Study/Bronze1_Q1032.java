package Backjoon_Study;

import java.io.*;

public class Bronze1_Q1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int files = Integer.parseInt(br.readLine());
        String[] namesArr = new String[files];

        for (int i=0; i<files; i++) {
            namesArr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        boolean isSame = true;
        for (int i=0; i<namesArr[0].length(); i++) {
            char c = namesArr[0].charAt(i);

            isSame = true;
            for (int j=1; j<files; j++) {
                if (c!=namesArr[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame == true) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }
        System.out.println(sb.toString());
    }
}
// 내가 도전한 풀이
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringBuilder sb = new StringBuilder();
//
//    int files = Integer.parseInt(br.readLine()); // 파일명 개수
//    String firstName = br.readLine(); // 첫번째 파일명
//    int nameLength = firstName.length(); // 파일이름 길이
//    boolean[] isEqual = new boolean[nameLength];
//
//    char[][] namesArr = new char[files][nameLength];
//
//        for (int j=0; j<nameLength; j++) {
//        namesArr[0][j] = firstName.charAt(j);
//        }
//        // 위 과정 charArr로 바꾸어서 namesArr에 추가할 수 있는 방법 있는지 찾아보기
//
//        for (int i=1; i<files; i++) {
//        String name = br.readLine();
//        for (int j=0; j<nameLength; j++) {
//        namesArr[i][j] = name.charAt(j);
//        }
//        }
//
//
//        for (int i=0; i<=files-1; i++) {
//        for (int j=0; j<nameLength; j++) {
////                System.out.println(namesArr[i][j]);
//        if ((namesArr[i][j] == namesArr[i+1][j])) {
//        isEqual[j] = true;
//        } else {
//        isEqual[j] = false;
//        }
//        }
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();


//                if (i<files-2) {
//                    if ((namesArr[i][j] == namesArr[i+1][j]) && (namesArr[i+1][j] == namesArr[i+2][j])) {
//                        bw.append(namesArr[i+1][j]);
//                    } else {
//                        bw.append('?');
//                    }
//                }

//                if (i>=files-2) {
//                    if ((namesArr[files-3][j] == namesArr[files-2][j]) && (namesArr[files-2][j] == namesArr[files-1][j])) {
//                        bw.append(namesArr[files-2][j]).append(namesArr[files-1][j]);
//                    } else {
//                        bw.append('?');
//                    }
//                }

//                if ((i<files-2) && (namesArr[i][j] == namesArr[i+1][j]) && (namesArr[i+1][j] == namesArr[i+2][j])) {
////                    isEqual = true;
//                    bw.append(namesArr[i+1][j]);
//                } else {
//                    bw.append('?');
//                }
//                if ((i>=files-2) && (namesArr[files-3][j] == namesArr[files-2][j]) && (namesArr[files-2][j] == namesArr[files-1][j])) {
////                    isEqual = true;
//                    bw.append(namesArr[files-2][j]).append(namesArr[files-1][j]);
//                } else {
//                    bw.append('?');
//                }