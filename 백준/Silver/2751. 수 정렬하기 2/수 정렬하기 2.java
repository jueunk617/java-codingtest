import java.io.*;

// Counting Sort 활용 방법
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001]; 
        // 중복되지 않기 때문에 boolean으로 선언. 
        // 수의 범위 : -1000000 ~ 1000000 
        
        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]){
                sb.append((i-1000000)).append('\n'); // i-1000000 : 실제 숫자로 변환
            }
        }
        
        System.out.print(sb);
                
    }
}