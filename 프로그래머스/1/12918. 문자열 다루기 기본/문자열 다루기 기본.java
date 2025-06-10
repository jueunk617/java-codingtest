class Solution {
    public boolean solution(String s) {
        // 길이 확인
        if (s.length() != 4 && s.length() != 6) return false;
                
        // 모두 숫자인지 확인
        for (char ch : s.toCharArray()) {
            if(!Character.isDigit(ch)) return false;
        }
        
        return true;
    }
}