import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String line = sc.nextLine();
            commend(stack, line);
        }


    }
    static void commend(Stack stack, String line){
        String[] parts = line.split(" ");
        String cmd = parts[0];

        switch(cmd){
            case "push":
                int x = Integer.parseInt(parts[1]);
                stack.push(x);
                break;

            case "pop":
                stack.pop();
                break;

            case "size":
                stack.size();
                break;

            case "empty":
                stack.empty();
                break;

            case "top":
                stack.top();
                break;
        }
    }

    static class Stack {
        int top; // 인덱스
        int size; // 크기
        int[] stack; // 스택

        public Stack() {
            top = -1;
            size = 0;
            stack = new int[100000];
        }

        public void push(int x) {
            top++;
            size++;
            stack[top] = x;
        }

        public void pop() {
            if(top == -1){
                System.out.println(-1);
            }else{
                System.out.println(stack[top]);
                top--;
                size--;
            }

        }

        public void size() {
            System.out.println(size);
        }

        public void empty() {
            if(top == -1){
                System.out.println(1);
            }
            else System.out.println(0);
        }

        public void top(){
            if(top == -1){
                System.out.println(-1);
            }else{
                System.out.println(stack[top]);
            }
        }
    }

}