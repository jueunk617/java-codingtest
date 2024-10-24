import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=2; i>=0; i--){
            sb1.append(A.charAt(i));
            sb2.append(B.charAt(i));
        }
        
        int a = Integer.parseInt(sb1.toString());
        int b = Integer.parseInt(sb2.toString());
        
        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }  
        
    }
}