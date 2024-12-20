import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        
        // N이 1인 경우
        if (N == 1) {
            return;
        }

        while (i * i <= N) { // 나누는 수의 범위를 제곱근까지 제한
            if (N % i == 0) { 
                System.out.println(i); 
                N /= i; 
            } else {
                i++; // 나누어떨어지지 않으면 다음 숫자로 이동
            }
        }

        // 마지막으로 남은 N이 1보다 크다면 소수
        if (N > 1) {
            System.out.println(N);
        }
        
    }
}