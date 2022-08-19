class MaximumSubarray{
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        
    }
    public static int maxSubArray(int [] nums){

        int maxSoFar = Integer.MIN_VALUE;
        int maxHere = 0;

        for(int num: nums){
            maxHere += num;

            if (maxSoFar < maxHere){
                maxSoFar = maxHere;
            }
            if (maxHere < 0){
                maxHere = 0;
            }
        }
        return maxSoFar;
    }
}