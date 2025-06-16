import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>(); // 중복 제거 + 자동 정렬
        
        for(int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
                
        return set.stream().mapToInt(Integer::intValue).toArray(); // set = 인덱스 접근 불가
    }
}