import java.util.*;
class Solution {
    public int solution(String before, String after) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < before.length(); i++) {
            list1.add(Character.toString(before.charAt(i)));
        }
        for(int i = 0; i < after.length(); i++) {
            list2.add(Character.toString(after.charAt(i)));
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        int answer = 0;
        if(list1.equals(list2)) {
            answer = 1;
        } else {
            answer = 0;
        }  
        return answer;
    }
}