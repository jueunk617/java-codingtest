import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
         // i~j번 째 자르기 -> 정렬 -> k번째 수
        for (int a=0; a<commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] sliced = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(sliced);
            answer[a] = sliced[k-1];
        }
        
        return answer;
    }
}