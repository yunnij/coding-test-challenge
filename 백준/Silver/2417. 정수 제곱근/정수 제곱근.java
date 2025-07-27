import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();


        System.out.println(binarySearch(n));
    }

    public static long binarySearch(long key) {
        long low = 0;
        long high = key;
        long mid;

        long answer = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if(Math.pow(mid, 2) >= key){
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }
}