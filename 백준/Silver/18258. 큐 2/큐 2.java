import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue queue = new Queue();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];

            switch(cmd){
                case "push":
                    int x = Integer.parseInt(parts[1]);
                    queue.push(x);
                    break;

                case "pop":
                    queue.pop();
                    break;

                case "size":
                    queue.size();
                    break;

                case "empty":
                    queue.empty();
                    break;

                case "front":
                    queue.front();
                    break;

                case "back":
                    queue.back();
                    break;
            }
        }

        System.out.print(queue.sb);

    }

    static class Queue {
        int front;
        int rear;
        int[] queue; // 스택

        StringBuilder sb = new StringBuilder();

        public Queue() {
            front = rear = 0;
            queue = new int[2000001];
        }

        public void push(int x) {
            queue[rear] = x;
            rear++;
        }

        public void pop() {
            if(front == rear) {
                sb.append(-1).append('\n');
            }else{
                sb.append(queue[front++]).append('\n');
            }
        }

        public void size() {
            sb.append(rear - front).append('\n');
        }

        public void empty() {
            if(front == rear){
                sb.append(1).append('\n');
            }
            else sb.append(0).append('\n');
        }

        public void front() {
            if (front == rear) {
                sb.append(-1).append('\n');
            } else {
                sb.append(queue[front]).append('\n');
            }
        }

        public void back() {
            if (front == rear) {
                sb.append(-1).append('\n');
            } else {
                sb.append(queue[rear - 1]).append('\n');
            }
        }
    }

}