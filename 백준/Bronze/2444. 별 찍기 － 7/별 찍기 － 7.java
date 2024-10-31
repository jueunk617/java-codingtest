import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        // 위쪽 피라미드
        for(int i=1; i<=N; i++){
            // 공백 
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            
            // 별
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
        
        // 아래쪽 피라미드
        for(int i=N-1; i>0; i--) {
            for(int j=0; j<N-i; j++) {
                System.out.print(" ");
            }
            
            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}