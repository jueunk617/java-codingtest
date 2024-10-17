import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> set = new HashSet<>(); // 중복된 값을 자동 제거하기 위해서 HashSet 사용
        
        for(int i=0; i<10; i++){
            int x = Integer.parseInt(br.readLine());
            set.add(x%42); 
        }
        
        System.out.println(set.size());
    }
}