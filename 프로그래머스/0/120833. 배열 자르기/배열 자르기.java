import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = numbers.length;
        
        if(0 <= num1 && num1 < length && num1 <= num2 && num2 < length) {
            return Arrays.copyOfRange(numbers, num1, num2+1);
        }
        else {
            return new int[0];
        }
    }
}