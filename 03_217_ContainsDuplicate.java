// using HashMap runtime 10 ms
class Solution{
    public boolean containsDuplicate(int[]nums){
        HashMap<Integer,Boolean> memo = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(memo.containsKey(nums[i])) return true;
            memo.put(nums[i],true);
        }
        return false;
    }
}

// using HashSet runtime 24 ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> numbers = new HashSet<>();
      for(int i=0; i<nums.length; i++){
          if(numbers.contains(nums[i])) return true;
          numbers.add(nums[i]);
      }
      return false;  
    }
}

// using Set runtime 8 ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
          if(seen.add(num) == false){
            return true;
          }
        }
        return false;
    }
}
