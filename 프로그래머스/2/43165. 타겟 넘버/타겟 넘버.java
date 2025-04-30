class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum) {
        // numbers : 대상 배열
   	    // target : 타겟 넘버
	    // depth : 노드 깊이
	    // sum : 이전 노드까지의 연산 값
        
        if(depth == numbers.length) { // 마지막 노드까지 탐색한 경우
            if(sum == target) {
                answer++; // 정답 카운트 증가
            }
            
            return;
        } 
        
        dfs(numbers, target, depth + 1, sum + numbers[depth]); // + 선택
        dfs(numbers, target, depth + 1, sum - numbers[depth]); // - 선택
    }
}