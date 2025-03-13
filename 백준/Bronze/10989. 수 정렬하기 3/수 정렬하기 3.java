import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[10000]; // 수의 범위 : 1 ~ 10000
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine()) - 1]++;
        }
        
        for(int i=0; i<arr.length; i++){
            while(arr[i]-- > 0){
                sb.append(i+1).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}