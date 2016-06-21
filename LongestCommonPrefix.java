public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() == 0 || strs[i] == "")
                return "";
            int len = prefix.length() > strs[i].length() ? strs[i].length() : prefix.length();
            int j = 0;
            for (; j < len; j++) {
                if (prefix.charAt(j) != strs[i].charAt(j))
                    break;
            }
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}
