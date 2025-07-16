import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int avg = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
            avg += arr[i];
        }

        avg /= 5;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(avg);
        System.out.println(arr[2]);
    }
}