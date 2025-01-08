import java.util.*;
class Solution {
    public String solution(String letter) {
        HashMap<String,String> hashMap = new HashMap<>();
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                          ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                          "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for(int i = 0; i < morse.length; i++) {
            hashMap.put(morse[i], Character.toString((char) (i + 'a')));
        }
        
        System.out.println(hashMap);
        
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++) {
            answer += hashMap.get(str[i]);
            
        }
        
        return answer;
    }
}