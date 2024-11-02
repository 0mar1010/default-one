package Q5;

public class Cylinder {
    private final double radius;
    private final double length;

    public Cylinder() {
        this.radius = 10;
        this.length = 10;
    }

    public Cylinder(double radius) {
        this.radius = radius;
        this.length = 10;
    }

    public Cylinder(double radius, double length) {
        this.radius = radius;
        this.length = length;
    }

    public Cylinder(Cylinder cylinder) {
        this.radius = cylinder.radius;
        this.length = cylinder.length;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getVolume() {
        return getArea() * length;
    }

    public void getVolumeArea(Cylinder cylinder) {
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Area: " + cylinder.getArea());
    }
}

