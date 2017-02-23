/**
* use binary search to solve this problem
* 因为是经过rotated的数组，数组中间mid的那个元素，如果比数组最左边的数值大，则说明mid左半边都是有
* 顺序的，右边的是具有rotated的那段，如果中间mid元素比数组最左边的数值小，说明rotated的交界处在mid右边
*/
public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length < 1) return -1;

        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l)/2;
            // the left part is in sorted order
            if (nums[m] == target) return m;
            //如果左边这段是sorted的，则可以找找target在不在左边这段
            // 如果右边那段是sorted，则搜target是够在右边
            // 保证搜索target的那一段是顺序的即可
            // 然后一直二分地查找顺序的一段数组
	    if (nums[m] >= nums[l]) {
	    // it should be greater and equal, test case failed: [3,1], target = 1;
                if (nums[l] <= target && target < nums[m]) r = m-1;
                else l = m+1;
            } else {
                if (nums[m] < target && target <= nums[r]) l = m+1;
                else r = m - 1;
            }
        }
        return nums[l] == target ? l:-1;
    }
}
