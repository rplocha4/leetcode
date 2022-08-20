import java.util.Arrays;

class CountingBits{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
    public static int[] countBits(int n) {
        int[] dp = new int[n+1];
        
        int offset = 1;
        
        for(int i = 1; i <= n; i++){
            if(2 * offset == i){
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}