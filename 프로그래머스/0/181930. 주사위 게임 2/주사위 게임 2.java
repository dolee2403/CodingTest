class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (1<=a && a<=6 && 1<=b && b<=6 && 1<=c && c<=6) {
            if(a != b && b != c && c != a) {
                answer = a + b + c;
            } else if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a)) {
                answer = (a + b + c)*(a*a + b*b + c*c);
            } else {
                answer = (a + b + c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
            }
        }
        return answer;
    }
}