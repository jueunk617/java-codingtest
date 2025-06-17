import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> honor = new PriorityQueue<>();
        int[] arr = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            honor.add(score[i]);
            
            if (honor.size() > k) {
                honor.poll();
            }
            
            arr[i] = honor.peek();
        }
        
        return arr;
    }
}