import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        
        if (x>0 && y>0){
            System.out.println("1");
        } else if (x<0 && y>0){
            System.out.println("2");
        } else if (x<0 && y<0){
            System.out.println("3");
        } else if (x>0 && y<0){
            System.out.println("4");
        } 
    }
}