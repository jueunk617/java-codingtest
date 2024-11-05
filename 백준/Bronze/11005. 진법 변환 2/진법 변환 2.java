import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder result = new StringBuilder();
        int share = N; // 몫
        
        while(share != 0){ // 진법 계산
            int rest = share % B;
            share = share / B;
            
            if(rest >= 10){
                result.append((char) ('A' + (rest - 10))); // 문자 반환
            } else {
                result.append(rest); // 그대로 숫자 반환
            }
        }
        
        System.out.println(result.reverse().toString()); // 역순 출력               
    }
}         