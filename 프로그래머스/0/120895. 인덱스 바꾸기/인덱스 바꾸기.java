import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            String str = Character.toString(my_string.charAt(i));
            list.add(str);
        }
        String temp = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, temp);
        
        String answer = "";
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
        }
    }
