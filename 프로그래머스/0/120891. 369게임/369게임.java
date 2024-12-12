class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = Character.getNumericValue(c);
            if(num % 3 == 0 && num != 0) { 
                answer++;
            }
            
        }
        return answer;
    }
}