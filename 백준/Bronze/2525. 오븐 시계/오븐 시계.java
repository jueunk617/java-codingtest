import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] current = br.readLine().split(" ");
        int A = Integer.parseInt(current[0]);
        int B = Integer.parseInt(current[1]);
        int C = Integer.parseInt(br.readLine());
        
        int D = 0; // 종료되는 시각의 시
        int E = 0; // 종료되는 시각의 분
        
        if(B+C >= 60){
            D = A + ((B+C)/60);
            E = (B+C)%60;
            
            if(D >= 24){
                System.out.println((D-24) + " " + E);
            }else {
                System.out.println(D + " " + E);
            }
            
        }else {
            System.out.println(A + " " + (B+C));
        }
    }
}