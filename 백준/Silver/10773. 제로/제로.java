import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<k; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if(num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        int sum = 0; // 스택의 총합
        
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        System.out.println(sum);
        
    }
}