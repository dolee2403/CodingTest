class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String newString1 = my_string.substring(0,s);
        String newString2 = my_string.substring(s + overwrite_string.length());
        System.out.println(newString1 + overwrite_string + newString2);
        String answer = newString1 + overwrite_string + newString2;
        return answer;
    }
}