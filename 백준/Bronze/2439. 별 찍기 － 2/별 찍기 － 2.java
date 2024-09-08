import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            // 공백
            for (int j=N-1; j>i; j--) {
                bw.write(" ");
            }
            
            // 별
            for (int k=0; k<=i; k++) {
                bw.write("*");
            }
            
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}