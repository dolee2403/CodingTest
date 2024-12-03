class Solution {
    public int solution(int price) {
        int answer = 0;
        double dis1 = price * 0.2;
        double dis2 = price * 0.1;
        double dis3 = price * 0.05;
        if(price >= 500000) {
            answer = (int) (price - dis1);
        } else if(500000 > price && price >= 300000) {
            answer = (int) (price - dis2);
        } else if(300000 > price && price >= 100000) {
            answer = (int) (price - dis3);
        } else {
            answer = price;
        }
        return answer;
    }
}