public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();  // StringBuilder 사용
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {  // i+1이 code의 배수일 때만
                answer.append(cipher.charAt(i));  // 문자 추가 (StringBuilder 사용)
            }
        }
        return answer.toString();  // 최종 문자열 반환
    }
}
