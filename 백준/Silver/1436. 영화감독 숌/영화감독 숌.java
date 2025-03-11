import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        int num = 1;
        
        while(count < N){
            String str = Integer.toString(num);
            
            if(str.contains("666")){
                count++;
            }
            
            num++;
        }
        
        System.out.println(num-1);
    }
}