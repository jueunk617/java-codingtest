import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        for (int i=0; i<photo.length; i++) {
            for (int j=0; j<photo[i].length; j++) {
                result[i] += map.getOrDefault(photo[i][j], 0); // 목록에 없는 사람 고려
            }
        }
        
        return result;
    }
}