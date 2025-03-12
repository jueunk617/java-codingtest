import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // reverseOrder()를 활용하려면 배열을 제너릭으로 선언해야 함
        Integer arr[] = new Integer[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // Collections.reverseOrder() 활용
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.println(arr[k-1]);
        
    }
}