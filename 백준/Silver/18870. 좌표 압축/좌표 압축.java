import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N]; // 원본 배열
        int[] sorted = new int[N]; // 정렬된 배열
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sorted);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int index = 0;       
        for(int value : sorted) { 
            if(!map.containsKey(value)) { // 중복되지 않을 때만
                map.put(value, index);
                index++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int value : arr) { // 원본 배열 기준으로 압축된 좌표 출력
            sb.append(map.get(value)).append(" ");
        }
        
        System.out.print(sb);
        
    }
}