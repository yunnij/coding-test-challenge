import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        TreeSet<String> workLog = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            String cmd = parts[1];

            switch(cmd){
                case "enter":
                    workLog.add(parts[0]);
                    break;

                case "leave":
                    workLog.remove(parts[0]);
                    break;
            }
        }

        Iterator<String> iter = workLog.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
