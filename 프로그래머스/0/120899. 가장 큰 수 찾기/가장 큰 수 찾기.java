class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        int[] answer = new int[2]; 
        for(int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}