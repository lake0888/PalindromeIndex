import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
        System.out.println(palindromeIndex("aaaaba"));
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        int lastIndex = s.length() - 1;
        for (int i = 0; i < s.length()/2; i++) {
            char first = s.charAt(i);
            char last = s.charAt(lastIndex - i);
            if (first != last) {
                String sub = s.substring(i, lastIndex - i + 1);

                String subLeft = sub.substring(1);
                String subRight = sub.substring(0, sub.length() - 1);

                if (isPalindrome(subLeft)) {
                    return i;
                } else if (isPalindrome(subRight)) {
                    return lastIndex - i;
                }
            }
        }
        return -1;
    }

    public static boolean isPalindrome(String s) {
        int last = s.length() - 1;
        for (int i = 0; i < s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(last - i)) return false;
        }
        return true;
    }
}