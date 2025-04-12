import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");       
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>(); // 듣도 못한 사람 저장 
        ArrayList<String> list = new ArrayList<>(); // 듣도 보도 못한 사람 저장
        
        for(int i=0; i<N; i++) {
            set.add(br.readLine());
        }
        
        for(int i=0; i<M; i++) {
            String name = br.readLine();
            
            if(set.contains(name)) {
                list.add(name);               
            }
        }
        
        Collections.sort(list); // 사전순 정렬
        
        System.out.println(list.size());
        for(String s : list) {
            System.out.println(s);
        }
        
    }
}