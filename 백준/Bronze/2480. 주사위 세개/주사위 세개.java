import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        
        if (a==b && b==c && c==a){
            System.out.println(10000+a*1000);
            
        } else if (a==b || b==c || c==a){
            
            if (a==b){
                System.out.println(1000+a*100);
            } else if (b==c){
                System.out.println(1000+b*100);
            } else if (c==a){
                System.out.println(1000+c*100);
            }
            
        } else {
            
            if (a>b && a>c){
                System.out.println(a*100);
            } else if (b>a && b>c){
                System.out.println(b*100);
            } else if (c>a && c>b){
                System.out.println(c*100);
            }
        }
  
    }
}