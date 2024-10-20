import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
  
        int arr[] = new int[N];
        int sum = 0;
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);
            sum = sum + arr[i];
        }
        
        System.out.println(sum);
    }
}