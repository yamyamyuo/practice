// the tricky thing of this problem: there are duplicate
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); wrong!
        
        for (int i = 0; i < nums.length; i++) {
            
            // processing duplicate of number 1
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            
            int target = -nums[i];
            int front = i+1;
            int back = nums.length - 1;
            while (front < back) {
                
                // 下面的分支，保证每个都会有front 或back的移动，否则会无法前进
                
                if (nums[front] + nums[back] < target)
                    front++;
                else if (nums[front] + nums[back] > target)
                    back--;
                else if (nums[front] + nums[back] == target){
                    // result.add(Arrays.asList(target, nums[front], nums[back]));
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[front]);
                    tmp.add(nums[back]);
                    result.add(tmp);
                    
                    // 既然已经有一个正确答案，两者同时移动
                    front++;
                    back--;
                    
                    // processing duplicate of number 2
                    while (front < back && nums[front] == nums[front-1])
                        front++;
                    
                    // processing duplicate of number 3
                    while (front < back && nums[back] == nums[back+1])
                    back--;
                }
                
        
            }
            
            
        }
        return result;
    }
}
