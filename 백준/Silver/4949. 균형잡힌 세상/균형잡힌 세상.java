import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String str = br.readLine();
            if(str.equals(".")) break; // 종료 조건
            
            Deque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;
            
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                
                if(c == '(' || c == '[') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') { // 스택이 비어있거나 짝이 안맞을 경우
                        isBalanced = false;
                        break;
                    }
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }                        
            }
            
            if(!stack.isEmpty()) isBalanced = false;
            sb.append(isBalanced ? "yes" : "no").append("\n");
        }
        
        System.out.print(sb);
    }
}