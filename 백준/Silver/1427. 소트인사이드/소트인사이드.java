import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();
        char[] ch = new char[str.length()];
        
        for(int i=0; i<str.length(); i++){
            ch[i] = str.charAt(i);
        }
        
        Arrays.sort(ch);
        
        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        
        System.out.print(sb);
        
    }
}