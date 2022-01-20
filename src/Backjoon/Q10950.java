package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] sumArr = new int[t];

        for (int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sumArr[i] = a+b;
        }
        sc.close();

        for(int i=0; i<t; i++) {
            System.out.println(sumArr[i]);
        }
    }
}
