import java.util.HashSet;
import java.util.Set;


class HappyNumber{
    public static void main(String[] args) {
        
    }
    public static boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            if(!set.add(n)){
                return false;
            }
            n = getNext(n);
        }
        return true;
    }
    public static int getNext(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            n /= 10;
            sum += rem * rem;
        }
        return sum;
    }
}