class NumberOf1Bits{
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
    public static int hammingWeight(int n) {
        int total = 0;
        
        while(n != 0){
            total += n & 1;
            n = n >>> 1;
        }
        
        return total;
    }
}