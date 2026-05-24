class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setData = new HashSet<>();
        for(int num: nums){
            if(setData.contains(num))
                return true;
            else setData.add(num);
        }
        return false;
    }
}