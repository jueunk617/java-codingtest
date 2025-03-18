import java.io.*;
import java.util.*;

// StringBuilder 배열 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder[] m = new StringBuilder[201]; // 나이의 범위 : 1 ~ 200
        
        for(int i=0; i<m.length; i++){ // StringBuilder 객체 생성
            m[i] = new StringBuilder();
        }
                
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken()); // 나이
            String name = st.nextToken(); // 이름
            
            // 카운팅 정렬 : 나이를 index로
            m[age].append(age).append(' ').append(name).append('\n');
        }
        
        StringBuilder sb = new StringBuilder();
        for(StringBuilder val : m) {
            sb.append(val); 
        }
        
        System.out.print(sb);
        
    }
}