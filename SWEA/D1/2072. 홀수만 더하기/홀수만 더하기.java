import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Solution { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sum = 0;
            
			for(int j=0; j<10; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num % 2 == 1) { // 홀수를 어떻게 표현하지??
					sum += num;
				}
			}
			
			System.out.println("#" + ( i+1) + " " + sum);
		}
	}
}