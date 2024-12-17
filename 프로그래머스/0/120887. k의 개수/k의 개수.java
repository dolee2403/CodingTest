import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num = i; num <= j; num++) {
            list.add(num);
        }
        
        int answer = 0;
        String kNum = Integer.toString(k);
        
        for(int l = 0; l < list.size(); l++) {
            String sNum = Integer.toString(list.get(l));
            for(int m = 0; m <sNum.length(); m++) {
                if(sNum.charAt(m) == kNum.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}