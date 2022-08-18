import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
    public static String minWindow(String s, String t) {
        
        int have = 0;

        Map<Character,Integer> tMap = new HashMap();
        Map<Character,Integer> sMap = new HashMap();

        int min = Integer.MAX_VALUE;


        for(Character c: t.toCharArray()){
            if (tMap.containsKey(c)){
                int val = tMap.get(c);
                tMap.put(c, val+1);
            } else 
                tMap.put(c, 1);
        }

        int l = 0;
        int goal = tMap.size();
        String res = "";

        for(int r = 0; r < s.length(); r++){
            Character c = s.charAt(r);

            int val = sMap.getOrDefault(c, 0);
            sMap.put(c, val+1);

            if (tMap.containsKey(c) && sMap.get(c).intValue() == tMap.get(c).intValue())
                have++;

            while(have == goal){
                if (r - l + 1 < min){
                    min = r - l + 1;
                    res = s.substring(l, r+1);
                }

                val = sMap.get(s.charAt(l));
                sMap.put(s.charAt(l), val-1);
  
                if (tMap.containsKey(s.charAt(l)) && (sMap.get(s.charAt(l)).intValue() < tMap.get(s.charAt(l)).intValue()))
                    have--;

                l++;
            }
        }
        return res;
    }
}
