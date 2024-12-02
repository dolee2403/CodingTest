class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6*n;
        for(int i = 1; i <= pizza; i++) {
            if(6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}