class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(2<= slice && slice <= 10) {
            answer = (n % slice == 0) ? n/slice : n/slice + 1;
        }
        return answer;
    }
}