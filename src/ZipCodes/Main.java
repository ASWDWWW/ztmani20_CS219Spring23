package ZipCodes;

import OOP.Particle;

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
        System.out.println(z1);
        System.out.println(z1.getCoord().dist(z2.getCoord()));
        System.out.println(z1.dist(z2));

        // create ZipCodeDB object
        ZipCodeDB db = new ZipCodeDB();
        db.load();
    }
}
