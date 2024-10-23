import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            
            for(int j=0; j<str.length(); j++){
               for(int k=0; k<R; k++){ // R번 반복
                   System.out.print(str.charAt(j));
               }
            }  
            
            System.out.println();
        }
        
    }
}