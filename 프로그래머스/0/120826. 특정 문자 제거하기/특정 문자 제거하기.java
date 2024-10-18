class Solution {
    public String solution(String my_string, String letter) {
        char str1 = letter.charAt(0);
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(c != str1) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}