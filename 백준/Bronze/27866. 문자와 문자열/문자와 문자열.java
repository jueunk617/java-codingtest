import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String[] arr = str.split(""); 
        int i = Integer.parseInt(br.readLine());
        
        System.out.print(arr[i-1]);
    }
}