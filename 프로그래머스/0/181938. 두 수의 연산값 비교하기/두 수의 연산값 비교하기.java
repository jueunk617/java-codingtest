class Solution {
    public int solution(int a, int b) {        
        String ab = "" + a + b;
        
        if (Integer.parseInt(ab) < 2 * a * b) {
            return 2 * a * b;
        }
        
        return Integer.parseInt(ab);
    }
}