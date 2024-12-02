class Solution {
    public int solution(int[] array) {
        int answer = 0; //최빈값
        int[] index = new int[1001];
        int max = 0; //최댓값
        int count = 0; //최빈값 개수 
        
        for (int i = 0; i < array.length; i++) {
            index[array[i]]++; // [0,1,1,3,1,0,0,0,     ]
        }
        
        for(int j = 0; j < index.length; j++) {
            if(index[j] > max) {
                max = index[j]; // i = 1 , 1 i = 2 , 1 i = 3 , 3
                answer = j; //3
                count = 1;
            } else if(index[j] == max) { // 3 i = 3
                count++; // 0
            }
        }
        
        if(count > 1) {
            return -1;
        } else {
            return answer;
        }
    }
}