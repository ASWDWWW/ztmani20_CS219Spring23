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
        int R = 6371000; // in meters
        double x = Math.pow(Math.sin(Math.toRadians((that.lat - this.lat)/2)),2) +
                Math.cos(Math.toRadians(this.lat)) *
                        Math.cos(Math.toRadians(that.lat)) *
                        Math.pow(Math.sin(Math.toRadians((that.lng - this.lng)/2)),2);
        double y = 2 * Math.atan2(Math.sqrt(x), Math.sqrt((1-x)));
        return R * y;
    }
}// class coord
