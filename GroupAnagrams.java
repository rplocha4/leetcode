import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class GroupAnagrams {
    public static void main(String[] args) {
        groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
    }

    public static void groupAnagrams(String[] strs) {

        Map<String, List<String>> hMap = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (int i = 0; i < str.toCharArray().length; i++) {
                arr[str.charAt(i) - 'a']++;
            }
            if (hMap.containsKey(Arrays.toString(arr)))
                hMap.get(Arrays.toString(arr)).add(str);
            else
                hMap.put(Arrays.toString(arr), new ArrayList<>(Arrays.asList(str)));

        }
        System.out.println(new ArrayList<>(hMap.values()));

    }
}