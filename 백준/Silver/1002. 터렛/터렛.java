import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();

            // 두 원의 중심 간 거리
            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if(d==0 && r1 == r2)
                System.out.println(-1);
            else if(d == r1 + r2 || d == r1 - r2 || d == r2 - r1)
                System.out.println(1);
            else if(Math.pow(r1-r2, 2) < Math.pow(d, 2) && d < r1 + r2)
                System.out.println(2);
            else
                System.out.println(0);
        }

    }

}