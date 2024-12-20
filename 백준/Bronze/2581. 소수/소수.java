import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0; // 소수의 합
        int min = 0; // 최솟값
        
        for (int i=M; i<=N; i++){
            if(isPrime(i)){
                if(sum == 0){ // 최솟값
                    min = i;
                }
                
                sum += i;
            } 
        }
        
        if(sum == 0){
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
    // 소수 판별 함수
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
            
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i ==0) 
                return false;
        }
        
        return true;
    }
}