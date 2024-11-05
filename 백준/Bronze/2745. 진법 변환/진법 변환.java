import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int result = 0;
        int power = 1; // B^0부터 시작
        
        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            int num;
                        
            if('A' <= c && c <= 'Z'){ // 알파벳일 경우
                num = c - 'A' + 10; 
            } else {
                num = c - '0'; // 숫자인 경우
            }
            
            result += num * power; 
            power *= B; // 거듭제곱 증가
        }
        
        System.out.println(result);
    }
}