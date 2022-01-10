package Backjoon;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else if (a < b) {
            System.out.println("<");
        }
    }
}
