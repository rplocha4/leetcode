class ReverseInteger{
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int x) {
        int res = 0;
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        
        while (x!=0){
            int rem = x % 10;
            x /= 10;
            if (res > MAX/10 || (res == MAX/10 && rem > MAX % 10)){
                return 0;
            }
            if (res < MIN/10 || (res == MIN/10 && rem < MIN % 10)){
                return 0;
            }
            res = res * 10 + rem;

        }
        return res;
    }
}