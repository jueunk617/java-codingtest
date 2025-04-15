import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            long N = Long.parseLong(br.readLine());
            if(N <= 1) N = 2;
            
            while(true) {
                if(isPrime(N)) {
                    sb.append(N).append("\n");
                    break;
                }
                N++;
            }
        }
        
        System.out.print(sb);
    }
    
    public static boolean isPrime(long N) {
        if(N < 2) return false; // 2보다 작은 수 != 소수.
        if(N == 2) return true; // 2는 소수.
        if(N % 2 == 0) return false; // 2를 제외한 짝수 != 소수.
        
        for(long i = 3; i*i<=N; i+= 2) { // N의 제곱근까지 홀수만 검사.
            if (N % i == 0) return false;
        }
        
        return true;
    }
}