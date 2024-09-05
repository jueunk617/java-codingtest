import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int N = Integer.parseInt(str);
        
        for(int i=1; i<10; i++){ // int i 선언
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}