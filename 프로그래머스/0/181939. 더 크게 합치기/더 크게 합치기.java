class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (1 <= a && a <= 10000 && 1 <= b && b <= 10000) {
            String c = Integer.toString(a) + Integer.toString(b);
            String d = Integer.toString(b) + Integer.toString(a);
            
            int cNum = Integer.parseInt(c);
            int dNum = Integer.parseInt(d);
            
            if(cNum > dNum) {
                answer = cNum;
            } else if (cNum == dNum) {
                answer = cNum;
            } else {
                answer = dNum;
            }
            
        }
        return answer;
    }
}