import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N  = Integer.parseInt(br.readLine());
        
        // Queue에는 peekLast() 메소드가 없기 때문에 Deque로 선언
        Deque<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String command = st.nextToken();
            
            switch(command) {
                case "push" :
                    int X = Integer.parseInt(st.nextToken());
                    queue.offer(X);
                    break;
                    
                case "pop" : 
                    if(!queue.isEmpty()) {
                        sb.append(queue.poll()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                
                case "size" :
                    sb.append(queue.size()).append('\n');
                    break;
                
                case "empty" :
                    if(queue.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                    
                case "front" :
                    if(!queue.isEmpty()) {
                        sb.append(queue.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                    
                case "back" :
                    if(!queue.isEmpty()) {
                        Integer it = queue.peekLast();
                        sb.append(it).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        
        System.out.print(sb);
    }
}