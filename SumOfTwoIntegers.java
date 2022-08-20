class SumOfTWoIntegers{
    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }
    public static int getSum(int a, int b) {
        
        while(a != 0){
            int tmp = (a & b) << 1;
            b ^= a;
            a = tmp;
        }
        return b;
    }
}