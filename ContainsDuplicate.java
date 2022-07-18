import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (hMap.containsKey(val))
                return (new int[] { hMap.get(val), i });
            hMap.put(nums[i], i);
        }
        return new int[] {};

    }
}