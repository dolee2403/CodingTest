class Solution {
    public int solution(int balls, int share) {
        // C(5,3) = C(5,2)
        if(share > balls - share) {
            share = balls - share;
        }
        
        long result = 1;
        
        for(int i = 1; i <= share; i++) {
            result = result * (balls - (share - i)) / i;
        }
        
        return (int) result;
    }
}