import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> line = new LinkedList<>(); // 현재 줄
        Deque<Integer> stack = new ArrayDeque<>(); // 대기열
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            line.add(Integer.parseInt(st.nextToken()));
        }
        
        int num = 1; // 간식 번호
        
        while(!line.isEmpty()) { // 줄 처리
            if(line.peek() == num) {
                line.poll();
                num++;
            } else if(!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                stack.push(line.poll());
            }
        }
        
        while(!stack.isEmpty()) { // 남은 스택 처리
            if(stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        
        System.out.println("Nice");
    }
}