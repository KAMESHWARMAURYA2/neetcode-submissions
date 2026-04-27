class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int index =0; index<nums.length; index++) {
            freqMap.put(nums[index], freqMap.getOrDefault(nums[index], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() >1) {
                return true;
            }
        }

        return false;
        
    }
}