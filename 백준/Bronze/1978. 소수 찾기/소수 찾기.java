import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 0; // 소수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){            
            int num = Integer.parseInt(st.nextToken());           
            if(isPrime(num)){ // 소수인지 확인
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2){ // 0과 1은 소수X.
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(num); i++){ // 2부터 루트 num까지만.
            if (num % i == 0){
                return false; // 나누어 떨어지면 소수X.
            }
        }
        
        return true;
    }
}