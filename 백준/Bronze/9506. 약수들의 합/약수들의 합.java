import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
           int n = Integer.parseInt(br.readLine());
            
           if(n == -1){
                break;
            }
            
            StringBuilder sb = new StringBuilder();
            int sum = 0; // 약수들의 합
                                    
            for(int i=1; i<n; i++){
                if(n % i == 0){
                    sum += i;
                    
                    if(sb.length() > 0){ 
                        sb.append(" + ");
                    }
                    
                    sb.append(i);
                }
            }
            
            if(n == sum){
                System.out.println(n + " = " + sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            } 
        }
    }
}