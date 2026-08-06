class Solution {
    public int missingNumber(int[] nums) {
        int a =nums.length;
        int b=(a*(a+1))/2;
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=nums[i];
        }
        return b-sum;
    }
}