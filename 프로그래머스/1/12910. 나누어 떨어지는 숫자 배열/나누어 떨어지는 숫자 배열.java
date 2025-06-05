import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // stream을 이용한 풀이
        int[] result = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();
        
        return result.length == 0 ? new int[]{-1} : result;
    }
}