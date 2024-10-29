import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        int maxCount = 0;
        int mode = -1;
        boolean isMultiple = false;
        
        for(int num : array) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            
            frequencyMap.put(num, count);
            
            if(count > maxCount) {
                maxCount = count;
                mode = num;
                isMultiple = false;
            } else if (count == maxCount) {
                isMultiple = true;
            }
        }
        return isMultiple ? -1 : mode;
    }
}