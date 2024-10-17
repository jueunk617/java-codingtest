import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        int arr[] = new int[N];
        
        for(int a=1; a<=M; a++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());
            
            for(int b=i-1; b<=j-1; b++){
                arr[b] = k;
            }
        }
        
        for(int c=0; c<N; c++){
            System.out.print(arr[c] + " ");
        }
    }
}