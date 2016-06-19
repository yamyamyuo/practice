public class Solution {
    public int r2i(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (i > 0 && r2i(s.charAt(i)) > r2i(s.charAt(i-1))) {
                result += (r2i(s.charAt(i)) - 2*r2i(s.charAt(i-1)));
            } else {
                result += r2i(s.charAt(i));
            }
            
        }
        return result;
    }
}
