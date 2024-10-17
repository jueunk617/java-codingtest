import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[30]; // 0~29번 (원래는 1~30)
        
        for(int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num-1] = 1; // 출석한 사람은 1
        }
        
        for(int i=0; i<30; i++){
            if(arr[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}