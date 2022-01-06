package Backjoon;

import java.util.Scanner;

public class Q2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inAlbum = Integer.parseInt(sc.next());
        int mean = Integer.parseInt(sc.next());

        int melodyLeast = (inAlbum * (mean-1)) + 1;
        System.out.println(melodyLeast);
    }
}
