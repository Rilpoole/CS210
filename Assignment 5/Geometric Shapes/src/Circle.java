public class Circle implements IShape {
    private double radius;

    Circle(double radius) {

        // If radius is less than zero the shape is nonsensical
        if (radius < 0) {
            radius = 0;
            System.out.println("Warning: Negative radius.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
