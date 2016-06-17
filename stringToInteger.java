public class Solution {
  // 1. null
  // 2. sign
  // 3. strip the head and tail
  // 4. if overflow, return the max or min value
    public int myAtoi(String str) {
      int len = str.length();
      int res = 0;
      int prev_res = res;
      if (len == 0)
        return res;
      int i = 0;
      int sign = 1;
      while (i < len && str.charAt(i) == ' ') {
        i++;
      }
      if (i < len && str.charAt(i) == '-') {
        sign = -1;
        i++;
      } else if (i < len && str.charAt(i) == '+') {
        sign = 1;
        i++;
      }
      while (i < len && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
        res = res*10 + (str.charAt(i) - 48);
        if ((res - str.charAt(i) + 48)/10 != prev_res) {
          res *= sign;
          return 0;
        }
        prev_res = res;
        i++;
      }
      return sign*res;
    }
}
