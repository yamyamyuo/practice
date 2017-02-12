public class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        int result[] = new int[2];
        for (int i = 0; i < len; i++) {
	    //you can use compliment here or origin numbers 
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            } else {
		// if you used compliment above, then non-compliment here, vise versa
                map.put(target-nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
