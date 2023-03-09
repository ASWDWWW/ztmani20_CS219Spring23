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
        word = word.toLowerCase();
        tiles = tiles.toLowerCase();
        int count = 0;
        int match = word.length();
        for (int i = 0; i < word.length(); i++){
            char z = word.charAt(i);
            if (tiles.indexOf(z) != -1 && tiles.indexOf(z) != 0) {
                tiles = tiles.substring(0,tiles.indexOf(z)) + tiles.substring(tiles.indexOf(z) + 1);
                count++;
            }
            if (tiles.indexOf(z) == 0) {
                tiles = tiles.substring(1);
                count++;
            }

        }
        return count == match;
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

        System.out.println();
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(canSpell("zakiy", "hazobapsiktoyyy"));
        System.out.println(canSpell("back", "hazobapsiktcuiehiwhkjhkckkhejwkeoyyy"));

        System.out.println(canSpell("cs", "hazobapsiktoychjkn"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));

        // Student: add more test cases including negative tests.
        // All tests should print true if the test passes.

    } // main

} // class Exercise66