import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int min = sides[1] - sides[0] + 1;
        int max = sides[0] + sides[1];
        int answer = 0;
        for(int i = min; i < max; i++) {
            answer++;
        }
        return answer;
    }
}