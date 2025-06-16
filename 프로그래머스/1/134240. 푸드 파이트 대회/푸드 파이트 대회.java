class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        // repeat() 활용 ver
        for (int i=1; i<food.length; i++) {            
            left.append(String.valueOf(i).repeat(food[i]/2));
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(left + "0");
        answer.append(left.reverse());
        
        return answer.toString();
    }
}