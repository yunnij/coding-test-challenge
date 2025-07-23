import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> card = new HashMap<>();

        for(int i = 0; i < n ; i++){
            card.put(sc.nextInt(), i);
        }

        int m = sc.nextInt();

        for(int i = 0; i < m ; i++){
            int num = sc.nextInt();
            if(card.containsKey(num)){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }
    }

}