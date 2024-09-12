class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (10 <= number && number <= 100 && 2 <= n && n < 10 && 2 <= m && m < 10) {
            if (number % n == 0 && number % m == 0) {
                answer = 1;
            }
        }
        return answer;
    }
}