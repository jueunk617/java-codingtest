import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력 받기
        int N = Integer.parseInt(br.readLine());  
        int[] a = new int[N];

        int min = Integer.MAX_VALUE; // 최솟값
        int max = Integer.MIN_VALUE; // 최댓값

        // 두 번째 입력 처리
        String str = br.readLine(); 
        StringTokenizer st = new StringTokenizer(str, " ");
        
        // 배열 값 저장 + 최솟값/최댓값 찾기
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            
            // 최솟값 구하기
            if (a[i] < min) {
                min = a[i];
            }

            // 최댓값 구하기
            if (a[i] > max) {
                max = a[i];
            }
        }

        // 결과 출력
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}