package ZipCodes;

public class ZipCode {
    private String code; // zipcode
    private String state; //the two char state code
    private String city; // city name
    private Coordinate coord; // lng/lat

    public ZipCode(String code, String state, String city, Coordinate coord) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.coord = coord;
    }
    public ZipCode(String code, String state, String city, double lng, double lat) {
        //called the constructor above so we dont have to duplicate
        this(code, state, city, new Coordinate(lng, lat));
    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public Coordinate getCoord() {
        return coord;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", coord=" + coord +
                '}';
    }

    public double dist(ZipCode that) {
        return this.coord.dist(that.coord);
    }
}
