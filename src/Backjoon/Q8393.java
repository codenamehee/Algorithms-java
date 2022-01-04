package Backjoon;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        int a;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for(int i=1; i<= a; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
