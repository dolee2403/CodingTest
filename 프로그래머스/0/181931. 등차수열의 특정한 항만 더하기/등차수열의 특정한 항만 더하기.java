class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        for (int i = 0; i < n; i++) {
            if (included[i]) {
                int value = a + i * d;
                answer += value;
            }
        }

        return answer;
    }
}
