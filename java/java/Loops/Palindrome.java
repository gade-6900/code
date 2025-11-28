public class Palindrome{

    // Function to check if a string is a palindrome using recursion
    public static boolean isPalindrome(String str) {
        // Base case: if the string is of length 0 or 1, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Check if the first and last characters are the same
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive call for the substring excluding the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "racecar"; // Example string to check

        // Call the isPalindrome function and print the result
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
