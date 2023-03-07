package HW5;

public class Exercise65_66 {

    public static Boolean isDoubloon(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == s.charAt(i)){
                    count++;
                }
            }
            if (count == 2){
                count = 0;
            }
            else {
                return false;
            }
        }
        return true;

    }

    public static boolean canSpell(String word, String tiles) {
        for (int i = 0; i < word.length(); i++){
            char z = word.charAt(i);
            for (int j = 0; j < tiles.length(); j++) {
                char s = tiles.charAt(tiles.indexOf(j));
                if (s == z){
                }
            }

        }

        return false; // squelch error message about no return statement
    }

    public static void main(String[] args) {
        // Positive tests isDoubloon
        System.out.println(isDoubloon("Abba"));
        System.out.println(isDoubloon("appeases"));
        System.out.println(isDoubloon("esophagographers"));
        System.out.println(isDoubloon("aassddff"));


        // Negative tests isDoubloon
        System.out.println(!isDoubloon("esophagographer"));
        System.out.println(!isDoubloon("bananab"));
        System.out.println(!isDoubloon("applesauce"));
        System.out.println(!isDoubloon("aasdf"));
        System.out.println(!isDoubloon("abcdefh"));

//        System.out.println(canSpell("boot", "axobasrto"));
//        System.out.println(!canSpell("hippo", "haxobapsrito"));

        // Student: add more test cases including negative tests.
        // All tests should print true if the test passes.

    } // main

} // class Exercise66