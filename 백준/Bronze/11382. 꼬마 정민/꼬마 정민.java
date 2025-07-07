import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] numArr = new long[3];
        long sum = 0;

        for(int i = 0; i < 3; i++){
            numArr[i] = sc.nextLong();
            sum += numArr[i];
        }

        System.out.println(sum);
    }
}