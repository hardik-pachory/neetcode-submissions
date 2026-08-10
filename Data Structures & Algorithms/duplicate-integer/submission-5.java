class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> setData = new HashSet<>();
        for(int num: nums){
            if(setData.contains(num))
                return true;
            setData.add(num);
        }
        return false;
    }
}