class Solution {
    public int solution(int n) {        
        String base3 = Integer.toString(n, 3); // 10 -> 3
        
        String reversed = new StringBuilder(base3).reverse().toString();
        
        int result = Integer.parseInt(reversed, 3); // 3 -> 10
        
        return result;
    }
}