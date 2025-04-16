import java.io.*;

public class Main {
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        getPrime();
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0; // 소수의 개수
          
            if(n == 0) break;
                        
            for(int i=n+1; i<=2*n; i++) {
                if(!prime[i]) count++;
            }
            
            sb.append(count).append('\n');
        }
        
        System.out.print(sb);
    }
    
    public static void getPrime() {
        // true = 소수X
        prime[0] = prime[1] = true;
        
        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}