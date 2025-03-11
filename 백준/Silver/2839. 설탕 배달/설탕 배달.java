import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int five = N/5; // 5kg 봉지 최대 개수
        
        while(five >= 0){
            int n = N - (5*five);
                
            if(n%3 == 0){ // 3kg 봉지로 나누어떨어지는 경우
                int three = n/3;
                System.out.println(five + three);
                return; // 종료
            }
                
                five--; // 5kg 봉지 개수 줄이기
        }
            
        System.out.println("-1"); // 정확히 나눌 수 없는 경우
    }
}