// runtime 1 ms
class Solution {
    public int maxSubArray(int[] nums) {
    int currMaxSum = nums[0];
    int maxSumSoFar = nums[0];
    for(int i=1; i<nums.length;i++){
        currMaxSum = Math.max(currMaxSum+nums[i], nums[i]);
        maxSumSoFar = Math.max(maxSumSoFar,currMaxSum);
    }
    return maxSumSoFar;
  }
}
