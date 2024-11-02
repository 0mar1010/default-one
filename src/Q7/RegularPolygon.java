package Q7;

public class RegularPolygon {

    //attributes
    private int n = 3;//the number of sides in the polygon.
    private double side = 1;//the length of the side.
    private double x = 0;//the x-coordinate of the polygon’s center.
    private double y = 0;//the y-coordinate of the polygon’s center.

    //constructors
    public RegularPolygon() {//default constructor
        //no assigning needed here
        // Default values are already set in field declarations
    }

    public RegularPolygon(int n, double side) {
        setN(n);
        setSide(side);
        this.x = this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        setN(n);
        setSide(side);
        setX(x);
        setY(y);
    }

    public RegularPolygon(RegularPolygon polygon) {
        this(polygon.getN(), polygon.getSide(), polygon.getX(), polygon.getY());
    }

    //setters
    public void setN(int n) {
        if (n < 0) System.out.println("Can't assign n less than zero!, it will return to the default value");
        else if (n > 5) System.out.println("Can't assign n greater than five!, it will return to the default value");
        else this.n = n;
    }

    public void setSide(double side) {
        if (side < 0) System.out.println("Can't assign side less than zero!, it will return to the default value");
        else if (side > 5)
            System.out.println("Can't assign side greater than five!, it will return to the default value");
        else this.side = side;
    }

    public void setX(double x) {
        if (x < -10) System.out.println("Can't assign x less than negative ten!, it will return to the default value");
        else if (x > 10)
            System.out.println("Can't assign x greater than positive ten!, it will return to the default value");
        else this.x = x;
    }

    public void setY(double y) {
        if (y < -10) System.out.println("Can't assign y less than negative ten!, it will return to the default value");
        else if (y > 10)
            System.out.println("Can't assign y greater than positive ten!, it will return to the default value");
        else this.y = y;
    }

    //getters
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //methods
    public double getArea() {
        return (getN() * Math.pow(getSide(), 2)) / (4 * Math.tan(Math.PI / getN()));
    }

    public double getPerimeter() {
        return getN() * getSide();
    }

}
