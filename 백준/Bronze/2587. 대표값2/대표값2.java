import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        int sum = 0; // 자연수의 총합
        
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr); // 정렬
        
        System.out.println(sum/5); // 평균
        System.out.println(arr[2]); // 중앙값      
        
    }
}