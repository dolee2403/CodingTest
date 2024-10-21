class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            result.append(String.valueOf(ch).repeat(n));
        }
        
        return result.toString();
        
    }
}