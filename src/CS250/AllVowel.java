package CS250;

public class AllVowel {
    /**
     *
     * @param string any string of alphabet characters
     * @return boolean value
     */
    public static boolean isAllVowels(String string) {
        // add a count to compare at the end
        int count = 0;
        // loop from the characters of the string
        for (int i = 0; i < string.length(); i++) {
            //check if vowel
            if ("aeiouyAEIOUY".indexOf(string.charAt(i)) > -1) {
                // if true then add 1 to count
                count++;
            }
            // if else then the string is not all vowels
            else {
                return false;
            }
        }
        // double check the count is equal to the length of the string
        return count == string.length();
    }
}
