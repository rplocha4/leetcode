class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 2, 7, 11, 15 }, 9));
        System.out.println(twoSum(new int[] { 2, 3, 4 }, 6));

        System.out.println(twoSum(new int[] { -1, 0 }, -1));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            if (numbers[l] + numbers[r] > target)
                r -= 1;
            else if (numbers[l] + numbers[r] < target)
                l += 1;
            else
                return new int[] { l + 1, r + 1 };

        }
        return new int[] {};
    }
}