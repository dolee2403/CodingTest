class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // 배열의 길이는 ()x
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length(); //strlist[i] 는 i 인덱스 배열의 문자열 이므로 ()o
        }
        return answer;
    }
}