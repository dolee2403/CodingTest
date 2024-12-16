import java.util.*;
class Solution {
    public String solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            String str = "";
            if(Character.isUpperCase(my_string.charAt(i))) {
                str = Character.toString(Character.toLowerCase(my_string.charAt(i)));
            } else {
                str = Character.toString(my_string.charAt(i));
            }
            list.add(str);
        }
        
        Collections.sort(list); 
        String answer = "";
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}