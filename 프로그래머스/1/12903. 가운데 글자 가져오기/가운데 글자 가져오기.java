class Solution {
    public String solution(String s) {
        // substring() 활용 풀이
        int mid = s.length() / 2;
        
        return (s.length() % 2 == 0)
            ? s.substring(mid - 1, mid + 1) // 짝수
            : s.substring(mid, mid + 1); // 홀수
    }
}