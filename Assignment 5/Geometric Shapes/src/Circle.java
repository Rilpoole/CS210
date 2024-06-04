public class Circle implements IShape {
    private double radius;

    /**
     * Note that if the radius is less than zero the shape is nonsensical. In this
     * case the radius is set to zero. (i.e. The area and circumference become
     * zero).
     * 
     * @param radius
     */
    Circle(double radius) {

        // If radius is less than zero the shape is nonsensical
        if (radius < 0) {
            radius = 0;
            System.out.println("Warning: Negative radius.");
        }
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * 
     * @return The area
     */
    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * Calculates the circumference of the circle.
     * 
     * @return The circumference
     */
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
