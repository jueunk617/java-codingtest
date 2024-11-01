import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // check()에서도 호출하기 위해서 static 선언

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i=0; i<N; i++){
            if(check()){
                count++;
            }
        }
        
        System.out.print(count);        
    }
    
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26]; // 알파벳 순서에 맞춘 배열
        int prev = 0;
        String str = br.readLine();
        
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            
            if(prev != now){
                if(!check[now - 'a']){
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}