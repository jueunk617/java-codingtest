class Solution {
    public int solution(int num1, int num2) {  
        double division = (double) num1 / num2;
        int answer = (int) (division * 1000);
        
        return answer;
    }
}