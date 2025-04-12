import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>(); // 키: 숫자카드의 값, 값: 개수
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int card = Integer.parseInt(st.nextToken());
            
            if(map.containsKey(card)){ 
                map.put(card, map.get(card) + 1); // 이미 존재할 경우 카운트함.
            } else {
                map.put(card, 1);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());          
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        
        System.out.print(sb.toString().trim());
        
    }
}