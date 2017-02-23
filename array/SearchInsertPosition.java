
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
	// why low <= high, test case: nums = [1], target = 2, should return 1, without equals will skip this cases
        while (low <= high) {
	    // if low and high are very big,this line will cause overflow errror...
	    // we can use: mid = (right - left) / 2 + left; this will prevent overflow.
            int mid = (low + high)/2;
            if (nums[mid] == target) 
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}

// could be neater.

int low = 0, high = A.length;
while(low<high) {
	mid=low+(high-low)/2; // low<=mid, mid<high
	if (nums[mid]>=target) high=mid; // high always decreases (even high-low==1)
	else low=mid+1; // low always increases
}
return low;
