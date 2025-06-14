class Solution {
    public int solution(String t, String p) {
        int result = 0;
        
        for (int i=0; i<=t.length()-p.length(); i++) {
            String str = t.substring(i, i + p.length());
            
            if (Long.parseLong(p) >= Long.parseLong(str)) {
                result++;
            }
        }
        
        return result;
    }
}