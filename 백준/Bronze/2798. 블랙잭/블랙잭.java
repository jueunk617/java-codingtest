import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = search(arr, N, M);
        System.out.println(result);
    }
    
    static int search(int[] arr, int N, int M){
        int result = 0;
        
        // 완전 탐색을 위한 3중 for문
        for(int i=0; i<N-2; i++){
            
            // 첫 번째 카드의 값이 이미 M보다 클 경우
            if(arr[i] > M) continue;
            
            for(int j=i+1; j<N-1; j++){
                
                // 첫 번째 카드와 두 번째 카드의 합이 이미 M보다 클 경우
                if(arr[i] + arr[j] > M) continue;
                
                for(int k=j+1; k<N; k++){
                    int tmp = arr[i] + arr[j] + arr[k];
                    
                    // 카드의 합이 M과 같다면 tmp 반환 및 종료
                    if(tmp == M) return tmp;
                    
                    // 이전 합보다 크고 + M보다 작을 경우 result 갱신
                    if(result < tmp && tmp < M){
                        result = tmp;
                    }
                }
            }
        }
        
        return result;
        
    }
}