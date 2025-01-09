import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            list.add(numlist[i]);
        }
        System.out.println(list);
        
        for(int i = 0; i < numlist.length; i++) {
            for(int j = i+1; j < numlist.length; j++) {
                int disI = Math.abs(n - numlist[i]);
                int disJ = Math.abs(n - numlist[j]);
                
                if((disI > disJ) || (disI == disJ && numlist[i] < numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }
        return answer;
    }
}