import java.io.*;
import java.util.StringTokenizer;

// 1) arr = boolean 배열로 선언하여 풀이하는 방법
public class Main {
    
    public static boolean arr[][]; // 전체 판
    public static int min = 64; // 8x8 체스판에서 가능한 최대 최솟값
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");      
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            
            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        
        // N-7, M-7 : (i, j)를 왼쪽 상단으로 설정
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                findMin(i, j);
            }
        }
        
        System.out.println(min);
        
    }
    
    // 체스판 검사 + 최솟값 찾기
    public static void findMin(int x, int y){
        int count = 0;
        
        boolean current = arr[x][y]; // 첫 번째 칸
        
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != current){
                    count++;
                }
                
                current = !current; // 다음 칸 색 변경
            }
            
            current = !current; // 다음 줄 첫 번째 칸 색 변경
        }
        
        count = Math.min(count, 64-count); // BW와 WB의 count 차이는 8x8에서 반대임. BW와 WB의 최솟값 비교
        min = Math.min(min, count);
    }
}