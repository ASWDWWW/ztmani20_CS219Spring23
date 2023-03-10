package CS250;

public class CrazyCaps {
    /**
     *
     * @param string any string with alphabet
     * @return string with caps at every even and lower at every odd place of string
     */
    public static String crazyCaps(String string) {
        // new string to add to
        String string2 = "";
        // go through each char
        for (int i = 0; i < string.length(); i++){
            //see if even or odd
            if (i % 2 == 0) {
                // tak the substring for the char
                String x = string.substring(i , i +1);
                //change char to lower case and add to new string
                string2 += x.toLowerCase();
            }
            else {
                String x = string.substring(i , i +1);
                //change char to lower case and add to new string
                string2 += x.toUpperCase();
            }
        }
        //return the new string
        return string2;
    }

    public static void main(String[] args) {
        System.out.println(crazyCaps("Hyu"));
    }
}
