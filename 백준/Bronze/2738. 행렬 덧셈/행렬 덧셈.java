import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");        
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        int[][] a = new int [N][M];
        int[][] b = new int [N][M];
        
        for(int i=0; i<N; i++){ // 행렬 A 값 입력
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                a[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        
        for(int i=0; i<N; i++){ // 행렬 B 값 입력
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                b[i][j] = Integer.parseInt(st3.nextToken());
            }
        }
        
        int[][] c = new int [N][M]; // 행렬 덧셈의 결과
        
        for(int i=0; i<N; i++){ // A + B
            for(int j=0; j<M; j++){
                c[i][j] = a[i][j] + b[i][j];
                
                System.out.print(c[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}