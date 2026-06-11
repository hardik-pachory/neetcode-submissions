class Solution {

    private void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void sortColors(int[] nums) {
        int i=0, l=0, r=nums.length-1;
        while(i <= r){
            if(nums[i]==0){
                swap(i++, l++, nums);
            } else if(nums[i] == 2){
                swap(i, r--, nums);
            } else{
                i++;
            }
        }
    }
}