class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        s = s.toLowerCase(); // 모두 소문자로 변환
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'p') { 
                pCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }

        if (pCount != yCount) {
            return false;
        } else {
            return true;
        }

    }
}