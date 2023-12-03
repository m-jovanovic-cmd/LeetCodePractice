package leetcodeproblems.easy;

public class PalindromeNumber09 {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int length = String.valueOf(x).length();
        int[] controller = new int[length];
        int i = 0;
        while(x != 0) {
            controller[i++] = x % 10;
            x /= 10;
        }
        int j = length - 1;
        for(i = 0; i < (length/2); i++, j--) {
            if(controller[i] != controller[j]) {
                return false;
            }
        }
        return true;
    }
}
