class Solution {
    public long solution(String numbers) {
        String[] numlist = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numlist.length; i++) {
            numbers = numbers.replaceAll(numlist[i], Integer.toString(i));
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}