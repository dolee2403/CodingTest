class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int len = my_string.length();
        if (1 <= len && len <= 100 && 1 <= k && k <= 100) {
            for (int i = 0; i < k; i++) {
                answer += my_string;
            }
        }
        return answer;
    }
}