
public class Solution {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length < 2) { // check to see if the string is less than 2 for example if it only has 1
                          // character then it is a palindrome

            System.out.println("1 character palindrome");
            return s;
        }
        for (int i = 0; i < length - 1; i++) {
            checkPalindrome(s, i, i);// checks for odd length palindrome
            checkPalindrome(s, i, i + 1);// checks for even length palindrome
        }
        return s.substring(resultStart, resultStart + resultLength);// prints out start position index to end position
                                                                    // index

    }

    private void checkPalindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {// start from the middle working
                                                                                    // outwards
            start--;// decrement moving left
            end++;// increment moving right
        } // while has to finish first then go to if statement

        if (resultLength < end - start - 1) {
            resultStart = start + 1;
            resultLength = end - start - 1;

        }

    }

    public static void main(String[] args) {

        String s = "babad";
        Solution checkPalindrome = new Solution();
        String palindromeSolution = checkPalindrome.longestPalindrome(s);

        System.out.println(palindromeSolution);

    }
}