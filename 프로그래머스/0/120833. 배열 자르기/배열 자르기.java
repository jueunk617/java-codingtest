import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // Arrays.copyOfRange : from부터 to-1 까지 잘라서 새 배열을 만듦.
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}