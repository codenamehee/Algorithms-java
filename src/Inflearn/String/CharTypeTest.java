package Inflearn.String;

public class CharTypeTest {
    public static void main(String[] args) {
        String bigStr = "ABCD";
        String smallStr = "abcd";

        char[] bigCharArr = bigStr.toCharArray();
        char[] smallCharArr = smallStr.toCharArray();

        for (char x : bigCharArr) {
            System.out.println(x);
            System.out.println(x-32);
        }
    }
}
