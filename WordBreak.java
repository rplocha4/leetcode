import java.util.Arrays;
import java.util.List;


class WordBreak{
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println(wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));



    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Arrays.fill(dp, false);
        dp[s.length()] = true;

        for(int i = s.length()-1; i>=0;i--)
            for(String word: wordDict)
                if(i + word.length()  <= s.length())
                    if(word.equals(s.substring(i, i + word.length())) && dp[i + word.length()] == true)
                            dp[i] = true;

        return dp[0];
    
    }
}
