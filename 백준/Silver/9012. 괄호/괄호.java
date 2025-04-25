import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        for(int i=0; i<T; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            String str = br.readLine();
            boolean isVPS = true; // VPS 여부
            
            for(int j=0; j<str.length(); j++) { // 괄호 비교
                char p = str.charAt(j);
                
                if(p == '(') {
                    stack.push(p);
                } else {
                    if(stack.isEmpty()) { // 닫는 괄호인데 스택이 비어 있다 = 짝 안 맞음
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(!stack.isEmpty()) isVPS = false; // 반복이 끝난 후에도 비어 있지 않다면 false
            sb.append(isVPS ? "YES" : "NO").append("\n");     
        }
        
        System.out.print(sb);
    }
}