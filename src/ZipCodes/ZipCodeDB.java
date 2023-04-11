package ZipCodes;

import Utility.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class ZipCodeDB {
    private static ArrayList<ZipCode> codes;

    public ZipCodeDB() {
         codes = new ArrayList<>();
    }

    public static void load() {
        String path = "http://10.60.15.25/~ehar/cs219/zips.txt";
        Scanner s = Util.openSite(path);

        if (s == null) {
            System.out.println("Error: Couldn't open site");
            return;
        }

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] parts = line.split(",");
            ZipCode code = new ZipCode(parts[1], parts[2], parts[3], Double.parseDouble(parts[4]) , Double.parseDouble(parts[5]));
            codes.add(code);
        }
    }
}
