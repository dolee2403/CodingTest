class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; ; i++) {
            int pie = n * i;
            if(pie % 6 == 0) {
                answer = pie/6;
                break;
            }
        }
        return answer;
    }
}