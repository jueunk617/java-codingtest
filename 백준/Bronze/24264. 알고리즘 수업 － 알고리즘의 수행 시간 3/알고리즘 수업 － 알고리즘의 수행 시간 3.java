import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()); // 오버플로우 주의
        
        // 시간복잡도 : O(n^2)
        System.out.println(n*n);
        System.out.println("2");        
    }
}