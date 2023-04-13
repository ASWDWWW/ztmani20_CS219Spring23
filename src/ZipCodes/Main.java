package ZipCodes;

import OOP.Particle;
import ZipCodes.ZipCodeDB;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(10.0, 20.0);
        Coordinate c2 = new Coordinate(20.0, 30.0);

        System.out.println(c1);
        System.out.println(c1.dist(c2));

        //create a zipcode object for canton
        ZipCode z1 = new ZipCode("13617", "NY", "Canton", new Coordinate(75.1, 44.6));
        ZipCode z2 = new ZipCode("13676", "NY", "Potsdam", 74.9, 44.6);
        ZipCode z3 = new ZipCode("13676", "MA", "Boston", new Coordinate(71.02, 42.38));

        System.out.println(z1);
        System.out.println(z1.getCoord().dist(z2.getCoord()));
        System.out.println(z1.dist(z2));
        System.out.println();
        System.out.println(z1.dist(z3));

        // create ZipCodeDB object
        ZipCodeDB db = new ZipCodeDB();
        db.load();
        System.out.println(db.findByZip("07206"));
        System.out.println(db.findByZip("00000"));

        db.findDuplicates();
        return;



    }
}
