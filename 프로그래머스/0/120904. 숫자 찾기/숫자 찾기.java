import java.util.*;
class Solution {
    public int solution(int num, int k) {
        List<String> list = new ArrayList<>();
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++) {
            list.add(Character.toString(str.charAt(i)));
        }
        System.out.print(list);
        int answer = 0; 
        for(int i = 0; i < list.size(); i++) {
            int n = Integer.parseInt(list.get(i));
            if(n == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}