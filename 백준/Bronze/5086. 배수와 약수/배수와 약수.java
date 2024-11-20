import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int first = 0; // 첫 번째 숫자
        int second = 0; // 두 번째 숫자
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            first = Integer.parseInt(st.nextToken()); 
            second = Integer.parseInt(st.nextToken()); 
            
            if(first == 0 && second ==0){
                break;
            }
            
            if(second % first == 0){ // 약수인 경우
                System.out.println("factor");
            } else if(first % second == 0){ // 배수인 경우
                System.out.println("multiple");
            } else { // 모두 아닌 경우
                System.out.println("neither");
            }
        }
    }
}