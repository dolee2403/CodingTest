import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            list.add(numbers[answer.length-1]);
            for(int i = 1; i < answer.length; i++) {
                list.add(numbers[i-1]);
            }
        } else {
            for(int i = 0; i < (answer.length-1); i++) {
                list.add(numbers[i+1]);
            }
            
            list.add(numbers[0]);
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
         return answer;  
        }
    }
