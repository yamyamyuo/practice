// solution using 3 sum
// 1. sort for better remove duplicate and less complexity
// 2. if else, = > <
// 3. while in sum == target, move forward and remove some duplicate

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
          // skip duplicate
          if (i > 0 && nums[i] == nums[i-1]) continue;

          for (int j = i+1; j < nums.length; j++) {
            // skip duplicate
            if (j != i + 1 && nums[j] == nums[j-1]) continue;

            int p = j+1;
            int q = nums.length - 1;
            while (p<q) {
              // put sum over here
              int sum = nums[i] + nums[j] + nums[p] + nums[q];
              if (sum == target) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[i]);
                tmp.add(nums[j]);
                tmp.add(nums[p]);
                tmp.add(nums[q]);
                result.add(tmp);

                // get a correct answear and move forward
                p++;
                q--;

                // must remove duplicate here, in sum == target
                while (p<q && nums[p] == nums[p-1]) p++;
                while (p<q && nums[q] == nums[q+1]) q--;

              } else if (sum < target) {
                p++;
              } else if (sum > target) {
                q--;
              }

            }

          }

        }
        return result;
    }
}
