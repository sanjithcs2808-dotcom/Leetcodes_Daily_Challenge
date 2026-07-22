class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int last =nums[0];
        int index=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=last){
                nums[index++]=nums[i];
                last=nums[i];
            }
        }
        return index;
    }
}