class Solution {
    public int solution(int[][] sizes) {        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int[] card : sizes) {
            // 값이 더 큰 쪽을 가로로 고정
            int w = Math.max(card[0], card[1]);
            int h = Math.min(card[0], card[1]);
            
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }
                
        return maxWidth * maxHeight;
    }
}