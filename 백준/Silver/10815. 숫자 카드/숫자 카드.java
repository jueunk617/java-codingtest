import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());  
        HashSet<Integer> set = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(set.contains(num)) { // 숫자 카드 존재 여부 확인
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        
        System.out.println(sb.toString().trim());        
        
    }
}