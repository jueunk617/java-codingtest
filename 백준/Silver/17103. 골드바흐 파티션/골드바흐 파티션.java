import java.io.*;

public class Main {
    public static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        getPrime();
        
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());            
            int count = 0; // 골드바흐 파티션의 수
                        
            // 골드바흐 파티션의 개수를 찾는 과정 = 투포인터
            for(int j=0; j<=N/2; j++) {
                if(!prime[j] && !prime[N - j]) {
                    count++;
                }
            }
                       
            sb.append(count).append('\n');
        }
        
        System.out.print(sb);
    }
    
    public static void getPrime() {
        // true = 소수X, false = 소수
        prime[0] = prime[1] = true;
        
        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
    
}