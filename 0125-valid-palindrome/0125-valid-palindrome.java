class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String temp = "";


        for (int i = 0; i < s.length(); i++) {

            char l = s.charAt(i);
            // (int)'a' == >  'a' <= s[i] <= 'z' || '0' <= s[i] <= '9'

            if (isAlphaNumeric(l)) {
                temp += l;
            }
        }

        for (int i = 0; i < temp.length()/2; i++) {

            if (temp.charAt(i) != temp.charAt((temp.length() - 1) - i))  {
                return false;
            }
        }
        return true;


    }

    public boolean isAlphaNumeric(char l) {

        return (l >= 'a' && l <= 'z' || l >= '0' && l <= '9');

    }
}