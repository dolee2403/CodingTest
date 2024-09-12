class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (1 <= a && a <= 10000 && 1 <= b && b <= 10000) {
            int c = 2*a*b;
            
            String d = Integer.toString(a) + Integer.toString(b);
            
            int dNum = Integer.parseInt(d);
            
            if (c > dNum) {
                answer = c;
            } else if (c == dNum) {
                answer = dNum;
            } else {
                answer = dNum;
            }
        }
        return answer;
    }
}