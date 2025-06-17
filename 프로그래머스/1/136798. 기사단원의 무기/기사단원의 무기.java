class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        
        for (int i=1; i<=number; i++) {
            int count = getDivisorCount(i);
            
            if (count > limit) {
                sum += power;
            } else {
                sum += count;
            }
        }
        
        return sum;
    }
    
    // 약수의 개수 구하기
    private int getDivisorCount(int n) {
        int count = 0;
        
        for (int i=1; i*i<=n; i++) {
            if (n % i == 0) {
                if (i * i == n) count += 1; // 제곱수
                else count += 2;
            }
        }
        
        return count;
    }
}