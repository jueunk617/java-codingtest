import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int numA = Integer.parseInt(st.nextToken());
            setA.add(numA);
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++) {
            int numB = Integer.parseInt(st.nextToken());
            setB.add(numB);
        }
        
        Set<Integer> temp = new HashSet<>(setA);
        temp.removeAll(setB); // A-B
        
        Set<Integer> temp2 = new HashSet<>(setB);
        temp2.removeAll(setA); // B-A
        
        System.out.println(temp.size() + temp2.size());
            
    }
}