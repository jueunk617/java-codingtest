import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }
        
        if(list.size() == 0) return new int[]{-1}; // 예외처리
        
        Collections.sort(list); // 오름차순 정렬
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}