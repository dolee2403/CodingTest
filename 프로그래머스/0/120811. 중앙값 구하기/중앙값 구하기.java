import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        if(array.length % 2 == 1) {
            answer = array[array.length/2];
        }
        return answer;
    }
}