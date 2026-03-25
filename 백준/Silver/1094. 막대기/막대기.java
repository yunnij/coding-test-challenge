import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().trim());

        ArrayList<Integer> sticks = new ArrayList<>();
        sticks.add(64);

        System.out.println(makeXStick(sticks, X));
    }

    public static int makeXStick(ArrayList<Integer> sticks, int X){
        int sum = stickSum(sticks);

        if (sum > X) {
            int minStick = Collections.min(sticks);
            if (sum - minStick / 2 >= X) {
                sticks.remove(Integer.valueOf(minStick)); // Integer.valueOf()로 감싸야 값 기준으로 제거
                sticks.add(minStick / 2);
            }else{
                sticks.remove(Integer.valueOf(minStick));
                sticks.add(minStick / 2);
                sticks.add(minStick / 2);
            }
            makeXStick(sticks, X);
        }
        return sticks.size();
    }

    public static int stickSum(ArrayList<Integer> sticks){
        int sum = 0;
        for (int stick : sticks) {
            sum += stick;
        }
        return sum;
    }
}