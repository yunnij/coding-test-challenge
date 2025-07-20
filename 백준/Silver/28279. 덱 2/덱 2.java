import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque deque = new Deque();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];

            switch(cmd){
                case "1":
                    int x = Integer.parseInt(parts[1]);
                    deque.addFirst(x);
                    break;

                case "2":
                    int y = Integer.parseInt(parts[1]);
                    deque.addLast(y);
                    break;

                case "3":
                    deque.removeFirst();
                    break;

                case "4":
                    deque.removeLast();
                    break;

                case "5":
                    deque.size();
                    break;

                case "6":
                    deque.empty();
                    break;

                case "7":
                    deque.peekFirst();
                    break;

                case "8":
                    deque.peekLast();
                    break;
            }
        }

        System.out.print(deque.sb);

    }

    static class Deque {
        int front;
        int rear;
        int[] deque;

        StringBuilder sb = new StringBuilder();

        public Deque() {
            front = rear = 1000000;
            deque = new int[2000001];
        }

        // 1
        public void addFirst(int x) {
            deque[--front] = x;
        }

        // 2
        public void addLast(int x) {
            deque[rear] = x;
            rear++;
        }

        // 3
        public void removeFirst() {
            if(front == rear) {
                sb.append(-1).append('\n');
            }else{
                sb.append(deque[front++]).append('\n');
            }
        }

        // 4
        public void removeLast() {
            if(front == rear) {
                sb.append(-1).append('\n');
            }else{
                sb.append(deque[--rear]).append('\n');
            }
        }

        // 5
        public void size() {
            sb.append(rear - front).append('\n');
        }

        // 6
        public void empty() {
            if(front == rear){
                sb.append(1).append('\n');
            }
            else sb.append(0).append('\n');
        }

        // 7
        public void peekFirst() {
            if (front == rear) {
                sb.append(-1).append('\n');
            } else {
                sb.append(deque[front]).append('\n');
            }
        }

        // 8
        public void peekLast() {
            if (front == rear) {
                sb.append(-1).append('\n');
            } else {
                sb.append(deque[rear - 1]).append('\n');
            }
        }
    }

}