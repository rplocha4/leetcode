class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;

        int min_len = nums.length+1;

        int curr_sum = 0;

        for(int r = 0; r<nums.length; r++){
            curr_sum += nums[r];

            while (curr_sum >= target){
                min_len = Math.min(min_len, r - l + 1);
                curr_sum -= nums[l];
                l += 1;
            }
        }
        int res = min_len != nums.length + 1 ? min_len : 0;
        return res;
    }
}