import java.util.Arrays;

class MaximumProductSubarray{
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
    }
    public static int maxProduct(int[] nums) {
        int max = 1;
        int min = 1;
        
        int res = Arrays.stream(nums).max().getAsInt();

        for(int i = 0; i < nums.length ; i++){
            if (nums[i] == 0){
                min = 1;
                max = 1;
            } else {
                int tmp = max * nums[i];
                max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
                min = Math.min(tmp, Math.min(min * nums[i], nums[i]));
                res = Math.max(res, max);
            }
        }
        return res;
    }
}