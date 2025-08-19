import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // int[] -> String[] 변환
        String[] arr = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);
        
        // 더 큰 쪽이 앞으로 오도록 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 모두 0인 경우
        if (arr[0].equals("0")) return "0";
        
        // 정렬된 순서대로 이어붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}