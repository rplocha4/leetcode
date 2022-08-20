import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class MissingNumber{
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }
    public static int missingNumber(int[] nums) {
        // sum solution
        // int len_sum = ((nums.length + 1) * (nums.length)) / 2;
        // return len_sum - Arrays.stream(nums).sum();


        // XOR solution
        int res = 0;
        for(int i = 0; i <= nums.length; i++)
            res ^= i;
            
        for (int num : nums)
            res ^= num;
            
        return res;
    }
}