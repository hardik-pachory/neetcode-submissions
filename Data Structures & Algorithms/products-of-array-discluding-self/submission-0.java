class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftPre = new int[len];
        int[] rightPre = new int[len];
        int left=1, right=len-2;
        leftPre[0] = 1;
        rightPre[len-1] = 1;

        for(; left<len; left++, right--){
            leftPre[left] = nums[left-1] * leftPre[left-1];
            rightPre[right] = nums[right+1] * rightPre[right+1];
            System.out.println("Left -> " + leftPre[left] + " at " + left + "   Right -> " + rightPre[right] + " at " + right);
        }

        int[] productArr = new int[len];
        for(int i=0; i<len; i++){
            productArr[i] = leftPre[i]*rightPre[i];
        }
        return productArr;
    }
}  
