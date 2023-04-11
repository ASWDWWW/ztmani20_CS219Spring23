package ZipCodes;

public class Coordinate {
    private double lng, lat;

    public Coordinate(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lng=" + lng +
                ", lat=" + lat +
                '}';
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    public double dist(Coordinate that) {
        // TODO Look up the great circle distance between two GPS coords
        return -1.0;
    }
}// class coord
