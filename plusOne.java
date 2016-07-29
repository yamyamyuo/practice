public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (len == 0)
            return digits;
        int i = len - 1;
        int carry = 1;
        while (i >= 0) {
            int digit = (digits[i] + carry)%10;
            carry = (digits[i] + carry)/10;
            digits[i] = digit;
            i--;
        }
        if (carry == 0)
            return digits;
        int [] res = new int[len+1];
        res[0] = carry;
        for (int j = 1; j < len + 1; j++) {
            res[j] = digits[j-1];
        }
        return res;
    }
}
