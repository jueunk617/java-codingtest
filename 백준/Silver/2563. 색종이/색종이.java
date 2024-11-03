import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        boolean square[][] = new boolean[100][100];
        
        for(int i=0; i<num; i++){            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
                     
            for(int j=x; j<x+10; j++){ // 색종이 영역 표시
                for(int k=y; k<y+10; k++){
                    square[j][k] = true;
                }
            }
        }
        
        int size = 0;
        for(int i=0; i<100; i++){
           for(int j=0; j<100; j++){
               if(square[i][j] == true){ // 겹치지 않는 영역 출력
                   size++;
               }
            } 
        }
        
        System.out.println(size);
    }
}