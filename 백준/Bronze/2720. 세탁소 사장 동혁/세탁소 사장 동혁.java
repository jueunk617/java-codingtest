import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / Q).append(" ");
            C %= Q;
            sb.append(C / D).append(" ");
            C %= D;
            sb.append(C / N).append(" ");
            C %= N;
            sb.append(C / P).append("\n");  
            
            System.out.print(sb.toString());
            sb.setLength(0); // StringBuilder 초기화
        }
    }
}