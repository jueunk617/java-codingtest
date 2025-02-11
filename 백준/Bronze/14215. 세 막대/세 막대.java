import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0; // 최대 둘레의 길이
        int arr[] = new int[3]; // 세 변의 길이를 저장할 배열
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");      
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        if (arr[2] < arr[0] + arr[1]){ // 삼각형의 조건을 만족할 경우
            result = arr[0] + arr[1] + arr[2];
        } else { // 만족하지 않을 경우
            arr[2] = arr[0] + arr[1] - 1;
            result = arr[0] + arr[1] + arr[2];
        }
        
        System.out.println(result); 
    }
}