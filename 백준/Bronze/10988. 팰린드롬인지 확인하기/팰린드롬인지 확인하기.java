import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] charArr = str.toCharArray();
        char[] reverseArr = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            reverseArr[i] = charArr[charArr.length - 1 - i];

            if(reverseArr[i] != charArr[i]){
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}