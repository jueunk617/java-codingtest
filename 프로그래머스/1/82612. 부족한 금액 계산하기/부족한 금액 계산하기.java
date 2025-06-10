class Solution {
    public long solution(int price, int money, int count) {
        long total = (long) price * count * (count + 1) / 2; // 등차수열의 합 활용
        
        return total > money ? total - money : 0;
    }
}