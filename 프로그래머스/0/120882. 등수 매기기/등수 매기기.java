import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Double> list = new ArrayList<>();
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            avg = (double) sum/score[i].length;
            list.add(avg);
            sum = 0;
            
        }
        System.out.println(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            int rank = 1;
            for(int j = 0; j < list.size(); j++) {
                if(list.get(i) < list.get(j)) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}