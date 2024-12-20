import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        
        if(N == 1){
            return;
        } else {
            while(N > 1){
                if(N % i == 0){
                    System.out.println(i);
                    N = N / i;
                } else {
                    i++;
                }
            }
        }
        
    }
}