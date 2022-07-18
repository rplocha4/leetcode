import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

class TopFrequent {
    public static void main(String[] args) {
        topKFrequent(new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 3 }, 2);
    }

    public static void topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[] res = new int[k];

        for (int num : nums)
            hMap.put(num, hMap.getOrDefault(num, 0) + 1);

        for (int key : hMap.keySet())
            pq.add(new int[] { key, hMap.get(key) });

        for (int i = 0; i < k; i++)
            res[i] = pq.poll()[0];

        System.out.println(Arrays.toString(res));

    }

}