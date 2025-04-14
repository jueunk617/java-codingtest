import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static long gcd(long a, long b) {
        while(b != 0) {
            long tmp = a % b;          
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b)); // 오버플로우 방지
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        
        System.out.println(lcm(A, B));
       
    }
}