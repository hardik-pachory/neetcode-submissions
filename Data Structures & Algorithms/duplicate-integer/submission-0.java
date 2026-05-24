class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setData = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(setData.contains(nums[i]))
                return true;
            else setData.add(nums[i]);
        }
        return false;
    }
}