import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        for (int i=0; i<cards1.length; i++) { queue1.add(cards1[i]); }
        
        Queue<String> queue2 = new LinkedList<>();
        for (int i=0; i<cards2.length; i++) { queue2.add(cards2[i]); }
        
        for (int i=0; i<goal.length; i++) {
            if (goal[i].equals(queue1.peek())) {
                queue1.poll();
                continue;
            } else if (goal[i].equals(queue2.peek())) {
                queue2.poll();
                continue;
            } else {
                return "No";
            }
        }
        
        return "Yes";
        
    }
}