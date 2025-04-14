import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");        
        int numA = Integer.parseInt(st.nextToken());
        int denA = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");    
        int numB = Integer.parseInt(st.nextToken());
        int denB = Integer.parseInt(st.nextToken());
        
        // 두 분수의 합을 구함.
        int numC = (numA * denB) + (numB * denA);
        int denC = denA * denB;
        
        // 기약분수로 만들기 위해 최대공약수를 구함.
        // 기약분수 = 각 분모, 분자의 공약수가 1인 분수. 따라서 최대공약수로 나눠줘야 함.
        int GCD = gcd(numC, denC); 
        
        StringBuilder sb = new StringBuilder();
        sb.append(numC / GCD).append(" ").append(denC / GCD);
        System.out.println(sb);
        
    }
    
    public static int gcd(int a, int b) {
        while(b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
  
}