import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());      
        int[] A = new int[N];
        
        // 수열 A
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) { 
            A[i] = Integer.parseInt(st.nextToken()); 
        }
        
        Deque<Integer> queue = new ArrayDeque<>(); // 큐만 작동하기 때문에 큐로만 선언
        
        // 수열 B
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
           int val = Integer.parseInt(st.nextToken());
           if(A[i] == 0) {
               queue.addLast(val); // 구조가 큐인 경우만 값 저장
           }
        }
        
        int M = Integer.parseInt(br.readLine()); // 수열의 길이
        
        // 수열 C
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) { // 뒤에서 넣고 앞에서 뺀다.
            int x = Integer.parseInt(st.nextToken());
            queue.addFirst(x);
            sb.append(queue.pollLast()).append(" ");          
        }
        
        System.out.println(sb.toString().trim());
    }
} 