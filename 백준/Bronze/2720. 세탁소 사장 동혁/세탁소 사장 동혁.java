import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            int C = Integer.parseInt(br.readLine());
            
            int Q = C / 25;
            int D = (C % 25) / 10;
            int N = ((C % 25) % 10) / 5;
            int P = ((C % 25) % 10) % 5;
            
            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}