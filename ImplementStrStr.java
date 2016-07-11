public class Solution {
    
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 == 0) {
            return 0;
        }
        int [] next = new int [len2];
        int i = 0;
        int j = -1;
        next[0] = -1;
        while (i < len2 -1) {
            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else
                j = next[j];
        }
        
        for (i = j = 0; i < len1; ) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
            if (j == len2) {
                return i - j;
            }
        }
        return -1;
    }
}
