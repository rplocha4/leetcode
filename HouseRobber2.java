import java.util.Arrays;

class HouseRobber2{
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
    }
    public static int rob(int[] nums){
        if (nums.length == 1) return nums[0];
        return Math.max(rob1(Arrays.copyOfRange(nums, 0, nums.length-1)), rob1(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    public static int rob1(int[] nums){
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