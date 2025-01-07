class Solution {
    public int solution(int n) {
        long fac = 1;
        for(int i = 1; fac <= n; i++) {
            fac *= i;
            if(fac > n) {
                return i - 1;
            }
        }
        int answer = (int) fac;
        return answer;
    }
}