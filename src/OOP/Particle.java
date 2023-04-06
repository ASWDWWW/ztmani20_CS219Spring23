package OOP;

// properties of one particle
public class Particle {
    //Non static varibles declared in a class are instance data
    // instance variable shoould be inaccessable outside of the object
    private double x, y, dx, dy;

    // the constructor is a function with the same name as the class and is used to crate objects for the class.
    public Particle(double x, double y, double dx, double dy) {

        //this keyword this refers to the object that was used on the left hand side of the dot
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    // getter method for x
    public double getX() {
        //this. refers to object on the left hand side of the dot
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    //toString method converts the objects state to a string suitable for human reading and printing
    //@Override is an intellij extension indicating that the toString() method is overriding the toString method and the base class
    @Override
    public String toString() {
        return "Particle{" +
                "x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
    public void move(){
        x = x + dx;
        y = y + dy;
    }

    public double origin() {
        return Math.sqrt(x*x + y*y);
    }
    public double dist(Particle p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2)) ;
    }
}
