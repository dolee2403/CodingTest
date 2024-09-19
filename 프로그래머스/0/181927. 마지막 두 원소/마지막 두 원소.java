import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int lastNum = num_list[num_list.length - 1];
        int prevNum = num_list[num_list.length - 2];
        
        int newElement;
        if (lastNum > prevNum) {
            newElement = lastNum - prevNum; 
        } else {
            newElement = lastNum * 2;
        }
        
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        result[result.length - 1] = newElement;
        
        return result;
    }
}
