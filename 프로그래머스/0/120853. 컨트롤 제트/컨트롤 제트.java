import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        int lastNum = 0;
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        
        for(int i = 0; i < str.length; i++) {
            String sNum = str[i];
            if(!sNum.equals("Z")) {
                num = Integer.parseInt(sNum);
                answer += num;
                lastNum = num;
            } else {
                answer -= lastNum;
            }
        }
        
        return answer;
    }
}