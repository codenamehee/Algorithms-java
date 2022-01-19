package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i=1; i<=t; i++) {
            int a = Integer.parseInt(sc.next());
            int b = sc.nextInt();
            arrayList.add(a);
            arrayList1.add(b);
        }

        for (int j=0; j<arrayList.size(); j++) {
            int sum = arrayList.get(j) + arrayList1.get(j);
            System.out.println(sum);
        }

//        System.out.println(sum);
    }
}
