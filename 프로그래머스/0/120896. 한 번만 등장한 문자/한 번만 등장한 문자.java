import java.util.*;
class Solution {
    public String solution(String s) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            hashMap.put(Character.toString(s.charAt(i)), hashMap.getOrDefault(Character.toString(s.charAt(i)), 0) + 1);
        }
        System.out.println(hashMap);
        for(int i = 0; i < s.length(); i++) {
            String k = Character.toString(s.charAt(i));
            if(hashMap.get(k) == 1) {
                answer += k;
            }
        }
        char[] chArr = answer.toCharArray();
        Arrays.sort(chArr);
        answer = new String(chArr);
        return answer;
    }
}