import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
                if(str1.length() == str2.length()){ // 길이가 같을 경우
                    return str1.compareTo(str2); // 사전 순 정렬
                } else {
                    return str1.length() - str2.length(); // 길이 기준 오름차순 정렬
                }
            }
        });
        
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        
        for(int i=1; i<N; i++){
            if(!arr[i].equals(arr[i-1])){ // 중복 제거
                sb.append(arr[i]).append('\n');
            }
        }
        
        System.out.print(sb);
        
    }
}