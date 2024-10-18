class Solution {
    public int solution(int n, int k) {
        int totaln = n * 12000;
        int totalk = k * 2000;
        int service = n/10;
        int totals = service * 2000;
        int result = totaln + totalk - totals;
        return result;
    }
}