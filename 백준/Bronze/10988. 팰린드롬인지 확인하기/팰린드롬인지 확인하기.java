import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        
        if(str1.equals(str2)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}