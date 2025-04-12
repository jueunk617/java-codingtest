import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");       
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<String, Integer>(); // 이름 -> 번호
        String[] arr = new String[N]; // 번호 -> 이름
        
        for(int i=0; i<N; i++){
            String name = br.readLine();
            map.put(name, i+1);
            arr[i] = name;
        }
        
        StringBuilder sb = new StringBuilder();        
        for(int i=0; i<M; i++){
            String question = br.readLine();
            
            if(Character.isDigit(question.charAt(0))){ // 질문이 숫자인지 문자열인지 구분
                int index = Integer.parseInt(question); // 숫자로 변환
                sb.append(arr[index - 1]).append('\n'); // 번호 -> 이름
            } else {
                sb.append(map.get(question)).append('\n'); // 이름 -> 번호
            }
        }
        
        System.out.print(sb);
        
    }
}