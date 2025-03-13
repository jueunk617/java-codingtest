import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        // 입력받은 숫자를 문자열로 저장
        char[] arr = br.readLine().toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(arr);
        
        // 내림차순 출력
        StringBuilder sb = new StringBuilder(new String(arr));
        System.out.println(sb.reverse());
        
    }
}