import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        boolean[] Prime = makePrime(N); // 에라토스테네스의 체 활용.
        
        for(int i=M; i<=N; i++) {
            if(!Prime[i]) {
                System.out.println(i);
            }
        }
        
    }
    
    public static boolean[] makePrime(int Max) {
        boolean[] Prime = new boolean[Max + 1];
        
        // true = 소수X
        Prime[0] = true;
        Prime[1] = true;
        
        for(int i=2; i<=Math.sqrt(Max); i++) {
            if(Prime[i]) {
                continue;
            }
            
            for(int j=i*i; j<Max+1; j+=i) { // 2의 배수가 이미 걸려져 i의 제곱부터 시작.
                Prime[j] = true;
            }
        }
        
        return Prime;
    }
    
}