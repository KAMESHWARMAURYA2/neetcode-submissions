class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int mejority = n/2;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int index =0; index < n; index++) {
            freqMap.put(nums[index], freqMap.getOrDefault(nums[index], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() > mejority) {
                return entry.getKey();
            }
        }

        return -1;
        
    }
}