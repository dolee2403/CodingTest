import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int height = 1;
        int width = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = height; i <= n; i++){
            for(int j = width; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}