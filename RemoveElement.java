public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
            i++;
        }
        return len;
    }
}
