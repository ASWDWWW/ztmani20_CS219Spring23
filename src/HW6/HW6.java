package HW6;

import java.util.Arrays;

public class HW6 {

    /*
     *   Return true if two values next to each other in the array are the same.
     *   See the tests in main.  The array should not be modified or reordered.
     *
     *   Don't forget that to compare two strings for equality you need to
     *   use the equals method, and not ==
     */
    public static boolean hasAdjacent(String [] aos) {
        String previous = aos[0];
        for (int i = 1; i < aos.length; i++){
            String a = aos[i];
            if (a.equals(previous)){
                return true;
            }
            else{
                previous = a;
            }
        }
        return false; // just to shut up error message
    }

    /*
     *   Return true if the array has a duplicate. Make sure the array
     *   is not modified or reordered. That is, don't sort it and check
     *   for adjacent values that are the same.
     *
     *  Hint 1: need to look at all possible pairs of array entries.
     *  Hint 2: Use a nested loop
     */
    public static boolean hasDuplicate(String [] aos) {
        for (int i = 0; i < aos.length - 1; i++) {
            String a = aos[i];
            for (int j = 0; j < aos.length; j++) {
                String b = aos[j];
                if (a.equals(b) && j != i) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
     *   Return true if two values at different locations in the array add up
     *   to the target.  Same hint as hasDuplicate.  See the tests in main.
     */
    public static boolean goofy(int [] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int b = nums[j];
                if (j != i) {
                   int tar = a + b;
                   if (tar == target){
                       return true;
                   }
                }
            }
        }
        return false;
    }

    /*
     *   Turn string s into an array of characters and return the array.
     */
    public static char [] make_array(String s) {
        char [] aoc = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            char add = s.charAt(i);
            aoc[j] = add;
            j++;
        }
        return aoc;
    }

    /*
     *   Return true if s1 is an anagram of s2. That is they contain the same letters.
     *   For example "angered" and "enraged" are anagrams.
     *
     *   Hint: Use make_array, Arrays.sort, and Arrays.equals directly.
     */
    public static boolean isAnagram(String s1, String s2) {
        char[] a = make_array(s1);
        char [] b = make_array(s2);
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    /*
     * Write a method  numDifferent that takes a sorted array of integers as a parameter and
     * returns the number of different values in the array. You can assume the array is in
     * sorted order. This means that duplicates will be next to each other. For example, if a
     * variable named nums has the following values:
     *
     *    int [] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
     *
     * then the call of numDifferent(nums) should return 9 because this list has 9 unique
     * values (3, 5, 8, 22, 23, 34, 39, 40 and 41). It is possible that the list might
     * not have any duplicates. For example if list instead stored this sequence of values:
     *
     *   int [] nums = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
     *
     *   numDifferent(nums) would return 15 because this list contains 15 different values.
     */
    public static int numDifferent(int [] nums) {
        Arrays.sort(nums);
        int count = 0;
        double previous = nums[0];
        previous = Double.NEGATIVE_INFINITY;
        for (int v : nums){
            if (v != previous) {
                count++;
            }
            previous = v;
        }
        return count;
    }

    public static void main(String[] args) {
        String [] names = {"Harry", "Ron", "Draco", "Draco", "Hermione"};
        String [] fruit = {"apple", "pear", "banana", "apple", "orange", "guava"};
        String [] fruit2 = {"apple", "apple", "pear", "banana", "orange", "guava"};
        String [] fruit3 = { "apple", "pear", "banana", "guava", "guava"};
        System.out.println(hasAdjacent(names));
        System.out.println(hasAdjacent(fruit2));
        System.out.println(hasAdjacent(fruit3));
        System.out.println(!hasAdjacent(fruit));

        System.out.println();

        System.out.println(hasDuplicate(names));
        System.out.println(hasDuplicate(fruit));
        System.out.println(hasDuplicate(fruit2));
        System.out.println(hasDuplicate(fruit3));
        System.out.println(!hasDuplicate(new String [] {"baseball", "hockey", "soccer", "football"}));

        System.out.println();

        int [] values = {2,7,11,15};
        int [] values2 = {2,2,2,2};
        System.out.println(goofy(values, 9));
        System.out.println(goofy(values2, 4));
        System.out.println(!goofy(values, 5));
        System.out.println(!goofy(values2, 5));

        System.out.println();

        System.out.println(Arrays.equals(make_array("hello"), new char [] {'h','e','l','l','o'}));
        System.out.println(Arrays.equals(make_array("zakiy"), new char [] {'z','a','k','i','y'}));

        System.out.println();

        System.out.println(isAnagram("angered", "enraged"));
        System.out.println(!isAnagram("pizza", "sauce"));
        System.out.println(!isAnagram("lock", "key"));

        System.out.println();

        int [] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
        System.out.println(numDifferent(nums) == 9);

        int [] nums2 = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
        System.out.println(numDifferent(nums2) == 15);
    }

}