class Solution {
    public int[] solution(int money) {
        int aa = 5500;
        int cup = money/aa;
        int rate = money%aa;
        
        return new int[] {cup, rate};
    }
}