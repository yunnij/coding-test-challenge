import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().trim());
        int i = 1;
        int j = 1;
        for(; i <= X;j++){
            if (i + j <= X)
                i = i + j;
            else
                break;
        }

        int m = 1; int n = j;
        while (i < X){
            m++;
            n--;
            i++;
        }
        if(j%2==0)
            System.out.println(m + "/" + n);
        else
            System.out.println(n + "/" + m);
    }

}