// runtime 1 ms
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] left = new int[nums.length];
       int[] right = new int[nums.length];

       left[0] = 1;
       for(int i = 1; i < nums.length; i++) {
           left[i] = left[i-1] * nums[i-1];
       }

       right[nums.length-1] = 1;
       for(int i = nums.length-2; i >= 0; i--) {
           right[i] = right[i+1] * nums[i+1];
       }

       int[] product = new int[nums.length];
       for(int i = 0; i < product.length; i++) {
           product[i] = left[i] * right[i];
       }

       return product;
    }
}

// runtime 10 ms
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i = 1; i< n; i++){
            left[i]  = nums[i-1]*left[i-1];
        }
        for(int i = n-2; i>=0; i--){
            right[i] = nums[i+1]*right[i+1];
        }
        for(int i=0; i<n; i++){
            output[i] = left[i]*right[i];
        }
        return output;
    }
}
