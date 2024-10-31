import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 알파벳 횟수 초기화
        int arr[] = new int[26];
        String str = br.readLine().toUpperCase(); // 입력받은 문자열 모두 대문자 변환
        int max = -1;
        char result = '?';
        
        // 횟수 카운트
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                arr[c-'A'] += 1;
            } 
        }
        
        // 가장 많이 사용된 알파벳 출력
        for(int j=0; j<26; j++){
            if(arr[j] > max){
                max = arr[j];
                result = (char)(j + 65);
            } else if (arr[j] == max){
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}