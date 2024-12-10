class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++) {
            String cStr = Character.toString(str.charAt(i));
            answer += Integer.parseInt(cStr);
            
        }
        return answer;
    }
}