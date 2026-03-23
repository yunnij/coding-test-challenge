import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] memo = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while(T > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(C(M,N));
            T--;
        }
    }

    public static int C(int m, int n){
        if (n == 0) return 1;
        if (m < n) return 0;
        if (m == n) return 1;

        if (memo[m][n] != 0) return memo[m][n];
        memo[m][n] = C(m - 1, n - 1) + C(m - 1, n);
        return memo[m][n];
    }
}