public class PalindromeNumber_9 {
    public static boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }

        String aString = String.valueOf(x);

        for (int i = 0; i < aString.length()/2 ; i++) {
            if (aString.charAt(i) != aString.charAt(aString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
