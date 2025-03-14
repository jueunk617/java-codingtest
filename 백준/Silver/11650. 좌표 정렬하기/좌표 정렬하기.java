import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());       
        int[][] arr = new int[N][2]; // 2차원 배열 선언
        
        for(int i=0; i<N; i++){ // 입력과 동시에 배열에 값 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
       
        // 2차원 배열 정렬을 위한 Comparator 람다식 활용
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) { 
                return o1[1] - o2[1]; 
            } else {
                return o1[0] - o2[0];
            }
        });
        
        for(int i=0; i<N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        
        System.out.print(sb);
        
    }
}