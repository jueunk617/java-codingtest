import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>(); 
        // int[]는 참조형 배열 타입이기 때문에 제네릭 타입 인자로 사용 가능
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            int move = Integer.parseInt(st.nextToken()); // 이동거리
            deque.offer(new int[]{i, move}); // 풍선 번호와 함께 배열에 저장함
        }
        
        while(!deque.isEmpty()) {
            int[] balloon = deque.poll();
            sb.append(balloon[0]).append(" "); // 터뜨릴 풍선 번호 출력
            
            if(deque.isEmpty()) break;
            
            int move = balloon[1]; // 이동거리
            
            if(move > 0) {
                for(int i=0; i<move-1; i++) { // 이동거리가 양수일 경우
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for(int i=0; i<-move; i++) { // 음수일 경우
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        
        System.out.println(sb.toString().trim());        
    }
}