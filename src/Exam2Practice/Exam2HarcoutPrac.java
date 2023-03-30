package Exam2Practice;

import java.util.Arrays;
import java.util.Objects;

public class Exam2HarcoutPrac {
    public static String [] switchIndex(String [] aos) {
        int i = 0;
        int j = 1;
        String x = aos[i];
        String y = aos[j];
        if (!Objects.equals(x, y)) {
            aos[i] = y;
            aos[j] = x;
        }
        return aos;
    }

    public static void checkStartZoo(String [] names) {
        String s = names[names.length-1];
        if (Objects.equals(s.substring(0, 3), "zoo")){
            System.out.println("yes");
        }
    }

    public static void upToZ(String s) {
        s = s.substring(0, s.indexOf("z"));
        System.out.println(s);
    }

    public static void checkEndIng(String s) {
        if (s.substring(s.length()-3).equals("ing")){
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        System.out.println(-23 % 10);
        System.out.println(23 % -10);
        System.out.println(Math.floorDiv(-17,3));
        System.out.println(Math.floorMod(-17,3));
        String [] a = {"CS", "Za"};
        System.out.println(Arrays.toString(switchIndex(a)));
        String [] b = {"zoosdjaskd"};
        checkStartZoo(b);
        String c = "boozedef";
        String d = "zdadea";
        upToZ(c);
        upToZ(d);
        String [] fruits = new String[5];

        checkEndIng("saddfing");
        String s = "sdfsa";
        System.out.println(s.charAt(s.indexOf("f")));

        System.out.println(-7%97);
        System.out.println(-33%15);
        System.out.println(Math.floorDiv(-7,99));
        System.out.println(Math.floorDiv(-16,3));
        System.out.println(Math.floorDiv(16,3));
        System.out.println(Math.floorMod(-7,99));
        System.out.println(Math.floorMod(7,99));
        String h = "sdinwdenweondwonedwonedwondewondewonedo";
        System.out.println(h.substring(10,10));
        //System.out.println(h.charAt(h.length()));
        System.out.println('a'+5);
        System.out.println((char) 'a' + 5);
        System.out.println((char) ('a' + 5));
        char ch = 'b';
        ch = (char) (ch - ('a'-'A'));
        System.out.println(ch);

    }
}
