import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){ // 배열 -1로 초기화
            arr[i] = -1;
        }
        
        String S = br.readLine();
        
        for(int j=0; j<S.length(); j++){
            char c = S.charAt(j);
            
            if(arr[c - 'a'] == -1){
                arr[c - 'a'] = j;
            }
        }
        
        for(int k=0; k<26; k++){
            System.out.print(arr[k] + " ");
        }
    }
}