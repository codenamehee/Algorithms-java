package Backjoon;

import java.util.Scanner;

public class Q3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());

        int R2 = 2*S - R1;

        System.out.println(R2);
    }
}
