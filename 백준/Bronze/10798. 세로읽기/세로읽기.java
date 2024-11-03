import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] arr = new char[5][]; // 한 줄에 글자가 몇 개 주어질 지 모름...
        
        for(int i=0; i<5; i++){ // 2차원 배열에 값 입력
            String str = br.readLine();
            arr[i] = new char[str.length()]; // 각 행을 문자열 길이에 맞춰 초기화
            
            for(int j=0; j<str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<15; i++){ // 세로 읽기로 출력
            for(int j=0; j<5; j++){                
                if(i<arr[j].length && arr[j][i] != '\0'){ // 배열 범위 내 && 빈 문자일 경우
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}