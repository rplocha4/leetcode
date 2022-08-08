class ClimbStairs{
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n){

        if (n<4) return n;
        int n1 = 2;
        int n2 = 3;
        
        for(int i = 4; i <=n; i++){
            int tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
        }
        return n2;
        
    }
}