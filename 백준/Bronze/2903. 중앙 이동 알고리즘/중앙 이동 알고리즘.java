import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int dot = 1;
        
        for(int i=1; i<=N; i++){ // 거듭제곱
            dot = dot * 2;
        }
        
        dot = dot + 1; // 한 변의 점의 개수
        
        System.out.println(dot*dot);
    }
}