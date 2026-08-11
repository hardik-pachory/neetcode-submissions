class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nextTarget;
        for(int i=0; i<nums.length; i++){
            nextTarget = target - nums[i];
            if(map.containsKey(nextTarget)){
                return new int[]{map.get(nextTarget), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
