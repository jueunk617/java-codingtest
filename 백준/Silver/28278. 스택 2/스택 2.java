import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            
            int command = Integer.parseInt(st.nextToken());
            
            switch(command) {
                case 1 :
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                    break;
                    
                case 2 :
                    if(!stack.isEmpty()) {
                        System.out.println(stack.pop());
                        break;
                    } else {
                        System.out.println("-1");
                        break;
                    }
                    
                case 3 :
                    System.out.println(stack.size());
                    break;
                    
                case 4 :
                    if(stack.isEmpty()) {
                        System.out.println("1");
                        break;
                    } else {
                        System.out.println("0");
                        break;
                    }
                    
                case 5 :
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek());
                        break;
                    } else {
                        System.out.println("-1");
                        break;
                    }
                    
            }
        }
    }
}