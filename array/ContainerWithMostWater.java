public class Solution {
    public int maxArea(int[] height) {
        int head = 0, tail = height.length -1;
        int maxArea = 0;
        while (head < tail) {
            int area = Math.min(height[head], height[tail]) * (tail - head);
            maxArea = maxArea > area? maxArea: area;
            if (height[head] > height[tail]) {
                tail--;
            } else {
                head++;
            }
        }
        return maxArea;
    }
}
