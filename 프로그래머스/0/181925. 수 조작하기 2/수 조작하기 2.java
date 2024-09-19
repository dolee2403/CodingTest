class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for (int i =1; i < numLog.length; i++) {
            int n = numLog[i] - numLog[i -1];
            
            if( n == 1) {
                answer.append("w");
            } else if (n == -1) {
                answer.append("s");
            } else if (n == 10) {
                answer.append("d");
            } else if (n == -10) {
                answer.append("a");
            }
            
        }
    
        return answer.toString();
    }
}