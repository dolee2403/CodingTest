class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total/num;
        if(num % 2 == 0) {
            middle += 1;
        }
        for(int i = 0; i < num; i++) {
            answer[i] = middle - (num/2) + i;
        }
        return answer;
    }
}