class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arrP = polynomial.split(" ");
        int x = 0;
        int n = 0;
        for(int i = 0; i < arrP.length; i++) {
            if(arrP[i].contains("x")) {
                x += arrP[i].equals("x") ? 1 : Integer.parseInt(arrP[i].replace("x", ""));
            } else if (!arrP[i].equals("+")) {
                n += Integer.parseInt(arrP[i]);
            }
        }
        if(x != 0) {
            if(x == 1) {
                answer += "x";
            } else {
                answer += x + "x";
            }
        }
        if(n != 0) {
            if(x != 0) {
                answer += " + " + n;
            } else {
                answer += n;
            }
        }
        return answer;
    }
}