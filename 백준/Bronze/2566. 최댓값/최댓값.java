import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[9][9];
        int max = -1; // 최댓값
        int position[] = new int[2]; // 최댓값의 위치
        
        for(int i=0; i<9; i++){ // 값 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                
                if(arr[i][j] > max){
                    max = arr[i][j];             
                    position[0] = i+1;
                    position[1] = j+1;
                } else if(arr[i][j] == max){ // 최댓값이 두 개 이상인 경우
                    position[0] = i+1;
                    position[1] = j+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(position[0] + " " + position[1]);
    }
}