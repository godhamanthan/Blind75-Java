// runtime 2 ms
class Solution{
    public int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> memo = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(memo.containsKey(comp)){
                return new int[]{memo.get(comp),i};
            }
            memo.put(nums[i],i);
        }
        return null;
    }
}

// runtime 0 ms
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i <= nums.length; i++){
            for (int j = 0; j < nums.length - i; j++){
                if (nums[j] + nums[j + i] == target) {
                    return new int[]{j, j + i};
                }
            }
        }

        return null;
    }
 }
