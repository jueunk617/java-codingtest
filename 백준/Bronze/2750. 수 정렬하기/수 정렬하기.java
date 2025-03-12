import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 버블 정렬
        for(int i=0; i<N-1; i++){ // 전체 반복 횟수
            for(int j=0; j<N-1; j++){ // 범위 조정
                if(arr[j] > arr[j+1]){ // 오름차순
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}