import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_str.length(); i += n) {
            int endStr = Math.min(i+n, my_str.length());
            list.add(my_str.substring(i, endStr));
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}