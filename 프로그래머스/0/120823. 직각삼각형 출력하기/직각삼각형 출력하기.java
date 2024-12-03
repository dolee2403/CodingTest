import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int heigth = 1; heigth <= n; heigth++){
            for(int width = 1; width <= heigth; width++){
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }
}