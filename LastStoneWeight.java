import java.util.PriorityQueue;

class LastStoneWeight{
    public static void main(String[] args) {
        int [] stones = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));

    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);

        for(int stone: stones){
           heap.add(stone);
        }
        
        while (heap.size() > 1){
            int val1 = heap.poll();
            int val2 = heap.poll();
            if(val1-val2 > 0) {
                heap.add(val1 - val2);
            }
        }
        int res = heap.size() == 0 ?  0 : heap.peek();
        return res;


    }
}