public class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 2;
        if (n <= 2)
            return n;
        int step = 0;
        for (int i = 2; i < n; i++) {
            step = a + b;
            a = b;
            b = step;
        }
        return step;
    }
}

// This is a typical DP problem. If you want to know the solution of step(n), you need to know step(n-1) and step(n-2)
// so we have equation: dp[n] = dp[n-1] + dp[n-2]
