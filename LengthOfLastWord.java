public class Solution {
  public int lengthOfLastWord(String s) {
    int len = s.length();
    int i = len-1;
    int count = 0;
    while (i >= 0) {
      if (s.charAt(i) == ' ') {
        if (count != 0) {
          return count;
        } 
      } else {
          count++;
        }
      i--;
    }
    return count;
  }
}

// s.charAt(i) == " " cause an error
// String s = "g"; valid
// String s = "gg"; valid
// char c = 'f'; valid
// char c = 'ff'; not valid
