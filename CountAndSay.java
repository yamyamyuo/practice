public class Solution {
  public String helper(String s) {
    char pre = s.charAt(0);
    int count = 1;
    int len = s.length();
    StringBuffer sb = new StringBuffer();
    int i = 1;
    while (i < len) {
      if (pre == s.charAt(i)) {
        count++;
      } else {
        sb.append(count).append(pre);
        count = 1;
        pre = s.charAt(i);
      }
      i++;
    }
    sb.append(count).append(pre);//len == 1 and the last one digit to be append over here
    return sb.toString();
  }
  
  public String countAndSay(int n) {
      if (n == 0)
        return "";
      int i = 1;
      String say = "1";
      while (i < n) {
        say = helper(say);
        i++;
      }
      return say;
  }
}
