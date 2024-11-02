package Q7;

public class Main {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(); // Using the no-arg constructor
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // Using the constructor with n and side
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); // Using the constructor with n, side, x, and y
        RegularPolygon polygon4 = new RegularPolygon(polygon3);

        // Display perimeter and area for each object
        System.out.println("Polygon 1: Perimeter = " + polygon1.getPerimeter() + ", Area = " + polygon1.getArea());
        System.out.println("Polygon 2: Perimeter = " + polygon2.getPerimeter() + ", Area = " + polygon2.getArea());
        System.out.println("Polygon 3: Perimeter = " + polygon3.getPerimeter() + ", Area = " + polygon3.getArea());
        System.out.println("Polygon 4: Perimeter = " + polygon4.getPerimeter() + ", Area = " + polygon3.getArea());
    }
}
