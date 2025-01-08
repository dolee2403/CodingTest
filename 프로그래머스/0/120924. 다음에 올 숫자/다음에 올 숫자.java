import java.util.*;
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 공차
        int[] arith = new int[common.length];
        int a = common[0]; //첫 항
        int d = common[1] - common[0]; //공차
        for(int i = 0; i < common.length; i++) {
            arith[i] = a + i * d;
        }
        System.out.println(Arrays.toString(arith));
        
        //공비
        int[] geome = new int[common.length];
        int b = common[0]; //첫 항
        int r = 0; 
        if(common[0] != 0) {
            r = common[1] / common[0];
        } // 공비
        geome[0] = b;
        for(int i = 1; i < common.length; i++) {
            geome[i] = geome[i-1] * r;
        }
        System.out.println(Arrays.toString(geome));
        
        if(arith[common.length-1] == common[common.length-1]) {
            answer = arith[common.length-1] + d;
        } if(geome[common.length-1]  == common[common.length-1]) {
            answer = geome[common.length-1] * r;
        } 
        
        return answer;
    }
}