class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') { // 공백
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') { // 대문자
                sb.append((char)('A' + (c - 'A' + n) % 26));
            } else if (c >= 'a' && c <= 'z') { // 소문자
                sb.append((char)('a' + (c - 'a' + n) % 26));
            }
        }
                
        return sb.toString();
    }
}