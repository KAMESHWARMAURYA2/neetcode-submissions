class Solution {
    public int removeDuplicates(int[] nums) {
        
      int k = 1;
      for(int index =1; index < nums.length; index++) {
        if(nums[index] != nums[index-1]){
            nums[k] = nums[index];
            k++;
        }
      }
      return k;
    }
}