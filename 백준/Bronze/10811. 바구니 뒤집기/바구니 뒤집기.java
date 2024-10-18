import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        int arr[] = new int[N];
        for (int a=0; a<N; a++){
            arr[a] = a+1; // 1부터 값을 넣기 위함
        }
        
        for(int b=0; b<M; b++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken())-1;
            int j = Integer.parseInt(st2.nextToken())-1;
            
            // 순서 역순으로 바꿈
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
                j--;
            }
        }
        
        for(int c=0; c<N; c++){
            System.out.print(arr[c] + " ");
        }
    }
}