class HauseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }

    public static int rob(int[] nums) {
        int prev = 0;
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(curr < nums[i] + prev) {
                int tmp = prev;
                prev = curr;
                curr = nums[i] + tmp;
            } else {
                prev = curr;
            }
        }
        return curr;
    }
}