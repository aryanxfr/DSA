class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }

        int[] skipFirst=new int[n+1];
        int[] skipLast=new int[n+1];

        for(int i=0;i<n-1;i++){
            skipFirst[i]=nums[i];//from first to before the last
            skipLast[i]=nums[i+1];//from second to last
        }

        int lootSkipFirst=robber(skipFirst);
        int lootSkipLast=robber(skipLast);

        return Math.max(lootSkipFirst,lootSkipLast);
        
    }
    private int robber(int[] nums){
        if(nums.length<2){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}