import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int arr[] = new int[N]; // 현재 심긴 나무의 위치       
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int gap[] = new int[N-1]; // 나무 사이의 간격
        for(int i=1; i<N; i++) {
            gap[i-1] = arr[i] - arr[i-1];
        }
        
        int result = gap[0];
        for(int i=1; i<N-1; i++) {
            result = gcd(result, gap[i]); // 간격들의 최대공약수
        }
        
        int trees = 0;
        for(int i=0; i<N-1; i++) {
            trees += (gap[i] / result) - 1; // 필요한 나무 수
        }
        
        System.out.println(trees);
        
    }
    
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}