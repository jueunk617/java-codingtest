import java.util.*;

class Solution {
    
    // 이동거리 : 상, 하, 좌, 우
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length]; // 방문 여부 + 최단 거리
        
        bfs(maps, visited); // 방문 배열에 최단 거리 기록
        
        answer = visited[maps.length - 1][maps[0].length - 1]; // 도착 지점의 거리 값
        
        if(answer == 0) answer = -1; // 도달 불가능한 경우 -1 반환
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited) {
        // 시작 위치 : (0, 0)
        int x = 0;
        int y = 0;
        
        visited[x][y] = 1; // 시작 지점 거리 : 1
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y}); // 시작 좌표 삽입
        
        while(!q.isEmpty()) {
            int[] current = q.remove(); // 현재 위치 꺼냄
            int cX = current[0];
            int cY = current[1];
            
            for(int i=0; i<4; i++) {
                // 다음 위치
                int nX = cX + dx[i];
                int nY = cY + dy[i];
                
                // 범위 체크
                if (nX < 0 || nX >= maps.length || nY < 0 || nY >= maps[0].length) {
                    continue;
                }

                // 아직 방문하지 않았고, 벽이 아닌 경우
                if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1; // 이전 칸 거리 + 1 저장
                    q.add(new int[]{nX, nY}); // 큐에 다음 위치 추가
                }
            }            
        }
    }
}