class Solution {
    public int solution(int a, int b, int n) {        
        int received = 0; // 새로 받은 콜라 개수
        int total = 0; // 받은 모든 콜라 개수
        
        while (n >= a) {
            received = (n / a) * b;
            total += received;
            n = (n % a) + received;
        }
        
        return total;
    }
}