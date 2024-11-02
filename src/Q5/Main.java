package Q5;

public class Main {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(5);
        Cylinder c3 = new Cylinder(5, 20);
        Cylinder c4 = new Cylinder(c3);

        System.out.println("Cylinder 1: Area = " + c1.getArea()
                + ", Volume = " + c1.getVolume());
        System.out.println("Cylinder 2: Area = " + c2.getArea()
                + ", Volume = " + c2.getVolume());
        System.out.println("Cylinder 3: Area = " + c3.getArea()
                + ", Volume = " + c3.getVolume());
        System.out.println("Cylinder 4: Area = " + c4.getArea()
                + ", Volume = " + c4.getVolume());
    }
}
