class Solution {
    public double solution(int[] arr) {
        double avg = 0;
        
        for (int i : arr) avg += i;        
        avg = avg / arr.length;
        
        return avg;
    }
}