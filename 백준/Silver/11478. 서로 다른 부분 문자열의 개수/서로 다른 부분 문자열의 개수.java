import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();       
        Set<String> set = new HashSet<>(); // 중복 제거
        
        // 모든 부분 문자열 생성
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                String sub = str.substring(i, j);
                set.add(sub);
            }
        }
        
        System.out.println(set.size());
        
    }
}