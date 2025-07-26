import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        
        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if(binarySearch(a, x, n-1, 0) == -1){
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }


    }

    public static int binarySearch(int[] arr, int key, int high, int low) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]){
                return mid;
            } else if(key < arr[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}