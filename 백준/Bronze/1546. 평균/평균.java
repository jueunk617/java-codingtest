import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.MIN_VALUE; // 최댓값 저장할 변수 (최초에 작은 값으로 설정)
        int arr[] = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){            
            arr[i] = Integer.parseInt(st.nextToken());
            
            if(arr[i] > M){
                M = arr[i];
            }
        }
        
        double sum = 0.0; // 합계는 실수로 선언 
        for (int j = 0; j < N; j++) {
            sum += (double) arr[j] / M * 100; 
        }
        
        double avg = sum / N;
        System.out.println(avg);
    }
}