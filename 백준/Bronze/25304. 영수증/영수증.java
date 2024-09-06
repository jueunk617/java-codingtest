import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int Y = 0; // 총 금액
        
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            Y = Y + a*b;
        }
        
        if (X==Y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }        
    }
}