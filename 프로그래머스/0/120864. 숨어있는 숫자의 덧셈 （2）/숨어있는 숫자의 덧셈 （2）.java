class Solution {
    public int solution(String my_string) {
        StringBuilder strB = new StringBuilder();
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)) {
                strB.append(ch);
            } else {
                if(strB.length() > 0) {
                    int num = Integer.parseInt(strB.toString());
                    answer += num;
                    strB.setLength(0);
                }
            }
        }
        if(strB.length() > 0) {
            int num = Integer.parseInt(strB.toString());
            answer += num;
        }
        return answer;
    }
}