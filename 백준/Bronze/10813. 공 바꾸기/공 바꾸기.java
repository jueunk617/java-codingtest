import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        int arr[] = new int[N+1]; // 배열이 1부터 시작하기 위해서
        for(int a=1; a<=N; a++){
            arr[a] = a;
        }
        
        for(int b=0; b<M; b++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken()); 
            int j = Integer.parseInt(st2.nextToken());
            
            int temp = arr[i]; // 값 교환할 때는 temp 사용 (swap)
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int c=1; c<=N; c++){
            System.out.print(arr[c] + " ");
        }
    }
}