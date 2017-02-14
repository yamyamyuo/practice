public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
	int res = Integer.MAX_VALUE;
	if (nums.length <= 3) {
		return nums[0] + nums[1] + nums[2]; 
	}	
	for (int i = 0; i < nums.length; i++) {
		int p = i+1;
		int q = nums.length - 1;
		int sum = nums[i] + nums[p] + nums[q];
	        while(p<q) {	
		if (sum == target) {
			return sum;
		}
		if (Math.abs(target - res) > Math.abs(target - sum)) {
			res = sum;
		}
		
		if (sum > target) {
			q--;
		} else if (sum < target) {
			p++;
		}
		
		}
	}
    }
}
