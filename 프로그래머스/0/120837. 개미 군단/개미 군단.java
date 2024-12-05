class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soilder = 3;
        int worker = 1;
        answer += hp/general;
        answer += (hp%general) / soilder;
        answer += ((hp%general) % soilder) / worker;
        return answer;
    }
}