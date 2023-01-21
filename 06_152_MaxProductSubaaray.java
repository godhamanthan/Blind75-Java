// runtime 2 ms
class Solution {
    public int maxProduct(int[] nums) {
     int maxoverall = nums[0];
     int minendhere = nums[0];
     int maxendhere = nums[0];
     for(int i=1; i<nums.length; i++){
         int temp = maxendhere;
         maxendhere = Math.max(nums[i],Math.max(nums[i]*maxendhere,nums[i]*minendhere));
         minendhere = Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*minendhere));
         maxoverall = Math.max(maxoverall,maxendhere);
     }
     return maxoverall;
     
    }
}

