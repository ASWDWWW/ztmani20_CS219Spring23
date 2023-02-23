package Chapter6;

public class StringPlay {
    public static Boolean isDubloon(String s) {
        int count = 0;
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
    //in alphabetical order
    public static boolean isAbecerdaian(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
        }
        return true;

    }
    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;
        //python for i in range(len(s)):
        for (int i=0; i < s.length(); i ++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o'){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hippopotomonstrosesquippedaliophobia";
        String u = "😂🤣❤😍❤";

        //functions vs methods
        // a method is a kind of function but is called on an object.
        //s is a string object. s is an instance of String.
        System.out.println(s.length());
        System.out.println(t.length());
        System.out.println(u.length()); //no answer for why

        //python get character at index 7 in t
        // t[7]
        System.out.println(u); //no answer for why
        System.out.println(t.charAt(7));
        //python t[len(t)-1]
        System.out.println(t.charAt(t.length()-1));
        System.out.println(t.toUpperCase());

        System.out.println(countVowels(s));
        System.out.println(countVowels(t));

        //Every character in every language is assigned a unique integer by the Unicode Consortium
        // cast (convert) 'a' to ann integer
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) '❤');

        System.out.println(isAbecerdaian("biopsy"));
        System.out.println(!isAbecerdaian("applesauce"));
        System.out.println(isAbecerdaian("BiOpSY"));
        System.out.println(isAbecerdaian("BIOpsy"));

        System.out.println();
        System.out.println(isDubloon("aassddff"));
        System.out.println(isDubloon("aasdf"));


    }
}
