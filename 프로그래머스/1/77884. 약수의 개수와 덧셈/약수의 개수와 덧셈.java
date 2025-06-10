// 제곱수 활용 ver. 
class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        // 제곱수 = 약수의 개수 홀수
        for (int i=left; i<=right; i++) {           
            if (Math.sqrt(i) % 1 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        
        return sum;
    }
}