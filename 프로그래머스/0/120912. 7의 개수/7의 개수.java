import java.util.*;
class Solution {
    public int solution(int[] array) {
        String str = "";
        for(int i = 0; i < array.length; i++) {
            str = Arrays.toString(array);
        }
        
        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            String s = Character.toString(str.charAt(i));
            if(s.equals("7")) {
                answer++;
            }
        }
        
        return answer;
    }
}