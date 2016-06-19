public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int div = 1;
        while (x/div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int l = x/div;
            int r = x%10;
            if (l != r) {
                return false;
            }
            x = x%div/10;
            div /= 100;
        }
        return true;
    }
    public boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        int div = 1;
        int temp = x;
        while (temp >= 10) {
            div *= 10;
            temp /= 10;
        }
        int left = div;
        int right = 1;
        while (left > right) {
            if (x/left%10 != x/right%10) {
                return false;
            }
            left /= 10;
            right *= 10;
            
        }
        return true;
    }
}


