import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[9];
        int max = arr[0]; 
        int maxIndex = 0; // 최댓값의 인덱스
        
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}