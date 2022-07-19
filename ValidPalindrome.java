class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));

    }

    public static boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char leftChar = Character.toLowerCase(s.charAt(l));
            char rightChar = Character.toLowerCase(s.charAt(r));

            while (!Character.isLetterOrDigit(leftChar)) {
                l += 1;
                leftChar = Character.toLowerCase(s.charAt(l));
            }
            while (!Character.isLetterOrDigit(rightChar)) {
                r -= 1;
                rightChar = Character.toLowerCase(s.charAt(r));
            }

            if (leftChar != rightChar)
                return false;

            l += 1;
            r -= 1;

        }
        return true;

    }
}