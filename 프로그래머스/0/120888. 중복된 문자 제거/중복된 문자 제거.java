import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            String str = Character.toString(my_string.charAt(i));
            list.add(str);
        }
        System.out.print(list);
        String answer = "";
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
            answer += list.get(i);
        }
        return answer;
    }
}