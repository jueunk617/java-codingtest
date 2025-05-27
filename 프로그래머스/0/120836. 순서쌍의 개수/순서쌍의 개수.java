class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i=1; i<=n; i++) {
            if (n % i == 0) count++; // 순서쌍의 개수 = 약수의 개수
        }
        
        return count;
    }
}