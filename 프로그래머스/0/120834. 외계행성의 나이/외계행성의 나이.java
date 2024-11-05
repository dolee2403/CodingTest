class Solution {
    public String solution(int age) {
        String answer = "";
        // a b c d e f g h i j
        // 0 1 2 3 4 5 6 7 8 9
        String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String ageStr = Integer.toString(age);
        
        for(int i = 0; i < ageStr.length(); i++) {
            int num = Integer.parseInt(String.valueOf(ageStr.charAt(i)));
            answer += strArr[num];
        }
        return answer;
    }
}