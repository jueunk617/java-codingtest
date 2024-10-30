import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[6];
        
        for(int i=0; i<6; i++){ // 배열에 입력받고 계산
            arr[i] = Integer.parseInt(st.nextToken());
            
            if (i==0 || i==1) { arr[i] = 1 - arr[i]; }        
            if (i==2 || i==3 || i==4) { arr[i] = 2 - arr[i]; }
            if (i==5) { arr[i] = 8 - arr[i]; }
        }
        
        for(int j=0; j<6; j++){ // 출력
            System.out.print(arr[j] + " ");
        }
    }
}