import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 사전순 역순 출력을 위해 HashSet 대신 TreeSet 사용
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder()); 
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");            
            String name = st.nextToken();
            String log = st.nextToken();
            
            if(log.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String name : set) {
            sb.append(name).append("\n");
        }
        
        System.out.print(sb);
        
    }
}