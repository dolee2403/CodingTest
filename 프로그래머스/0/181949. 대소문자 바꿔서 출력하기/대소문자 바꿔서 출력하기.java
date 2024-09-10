import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if (1 <= a.length() && a.length() <= 20 && isAlphabetic(a)) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (Character.isUpperCase(c)) {
                    System.out.printf("%c", Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    System.out.printf("%c", Character.toUpperCase(c));
                }
            }
        }
    }

    public static boolean isAlphabetic(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false; 
            }
        }
        return true;  
    }
}
