class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            while (!isAlphaNumeric(s.charAt(l)) && l < r) {
                l += 1;
            }

            while (!isAlphaNumeric(s.charAt(r)) && l < r) {
                r -= 1;
            }

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l += 1;
            r -= 1;
        }



        return true;
    }

    public boolean isAlphaNumeric(char l) {

        return (l >= 'a' && l <= 'z' || l >= '0' && l <= '9');

    }
}