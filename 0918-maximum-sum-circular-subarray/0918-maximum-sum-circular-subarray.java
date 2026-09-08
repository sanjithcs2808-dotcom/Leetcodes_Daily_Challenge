class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        
        int t =0;
        for (int i : nums){
            t+=i;
        }
        int cur_n=nums[0];
        int max_n=nums[0];
        for(int i =1; i<nums.length ;i++){
            cur_n =Math.max(nums[i],(cur_n + nums[i]));
            max_n =Math.max(cur_n,max_n);
        }
        if(max_n < 0){
            return max_n;
        }
        
        cur_n=nums[0];
        int min_n=nums[0];
         for(int i =1; i<nums.length ;i++){
            cur_n =Math.min(nums[i],(cur_n + nums[i]));
            min_n =Math.min(cur_n,min_n);
        }
        int cir =t - min_n;

        int max_c = Math.max(max_n,cir);
        return max_c;

    }
}