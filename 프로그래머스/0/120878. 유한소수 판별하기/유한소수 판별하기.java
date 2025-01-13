class Solution {
    public int solution(int a, int b) {
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        b = b /gcd;
        
        while (b % 2 == 0) {
            b /= 2;
        } while (b % 5 == 0) {
            b /= 5;
        }
        
        int answer = 0;
        if(b == 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}