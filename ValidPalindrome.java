class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));

    }

    public static boolean isPalindrome(String s) {

        StringBuilder newS = new StringBuilder();

        for (Character c : s.toCharArray())
            if (Character.isLetterOrDigit(c))
                newS.append(Character.toLowerCase(c));

        int l = 0;
        int r = newS.length() - 1;
        while (l < r) {
            if (newS.charAt(l) != newS.charAt(r))
                return false;
            l += 1;
            r -= 1;
        }
        return true;
    }
}