class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B)) {
                answer = 0;
                break;
            }
            A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
            
            if(A.equals(B)) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}