import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        byte N = sc.nextByte();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            byte b = sc.nextByte();
            sum += a * b;
        }

        if(X == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}