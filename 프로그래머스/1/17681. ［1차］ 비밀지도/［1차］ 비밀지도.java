class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for (int i=0; i<n; i++) {
            int line = arr1[i] | arr2[i]; // OR 연산
            String binary = Integer.toBinaryString(line); // 10진수 -> 2진수
            
            StringBuilder sb = new StringBuilder(binary);
            while (sb.length() < n) { // n자리 맞추기
                sb.insert(0, '0');
            }
            
            String converted = sb.toString().replace('1', '#').replace('0', ' ');
            
            result[i] = converted;
        }
        
        return result;
    }
}