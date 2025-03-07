import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        
        String n = br.readLine();
        int N = Integer.parseInt(n);        
        int M = 0;
        
        int start = Math.max(1, N - (9 * n.length())); 
        // N - (9 * n.length()) : 각 자리에서 최댓값만큼 감소된 범위에서부터 탐색 시작 (최소 1 이상)
        
        for(int i = start; i <= N; i++){            
            int sum = sumOfDigits(i);
            
            if(i + sum == N){
                M = i;
                break;
            }
        }
        
        System.out.println(M);          
    }
    
    // 각 자리 숫자의 합을 구하는 함수
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
 
}