class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            if(sum < 0) sum = 0;
            sum+=x;
            max = Math.max(sum , max);
        }

        return max;
    }
}
