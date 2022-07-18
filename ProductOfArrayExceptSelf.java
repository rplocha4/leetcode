import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        productExceptSelf(new int[] { 1, 2, 3, 4 });

    }

    public static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int prefix = 1;
        int sufix = 1;

        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= sufix;
            sufix *= nums[i];
        }

        System.out.println(Arrays.toString(res));

    }
}