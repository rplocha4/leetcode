class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{}));
    }
    public static int jump(int[] nums) {
        int jumps = 0;
        int l = 0;
        int r = 0;

        while(r < nums.length - 1){
            int maxJump = 0;
            
            for(int i = l; i <= r;i++){
                maxJump = Math.max(maxJump, i + nums[i]);
            }
            l = r + 1;

            r = maxJump;
            jumps++;
        }
        return jumps;

    }
}