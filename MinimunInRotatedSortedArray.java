class MinimumInRotatedSortedArray{
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        
    }
    public static int findMin(int [] nums){
        int min = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = (l+r) / 2;
            if (nums[mid] >= min)
                l = mid+1;
            else{
                r = mid-1;
                min = nums[mid];
            }
        }
        return min;
    }
}
