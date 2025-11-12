import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);        
        
        int n = citations.length; // 논문의 개수
        int h = 0;
        
        for (int i=0; i<n; i++) {
            int up = n - i; // citations[i]번 이상 인용된
            
            if (citations[i] >= up) {
                h = up;
                break;
            }
        }
        
        return h;
    }
}