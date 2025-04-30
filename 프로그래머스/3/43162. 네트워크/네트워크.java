class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int cnt = 0; // 네트워크 개수
        visited = new boolean[n]; // 컴퓨터 방문 배열
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, computers, n);
                cnt += 1; // 하나의 네트워크 완성
            }
        }
        
        return cnt;
    }
    
    public void dfs(int current, int[][] computers, int n) {
        // current : 현재 방문한 컴퓨터
        visited[current] = true;
        
        for(int i=0; i<n; i++) {
            if(i != current && computers[current][i] == 1 && !visited[i]){
                // 자기 자신이 아니고 + 연결되어 있고 + 아직 방문안했다면
                dfs(i, computers, n);
            }
        }
    }
}