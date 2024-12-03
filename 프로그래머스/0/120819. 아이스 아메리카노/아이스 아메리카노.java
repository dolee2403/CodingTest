class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int aa = 5500;
        int jan = money/aa;
        int rate = money%aa;
        if (money >= 5500) {
            answer[0] = jan;
            answer[1] = rate;
        } else {
            answer[0] = 0;
            answer[1] = rate;
        }
        return answer;
    }
}