public class Rectangle implements IShape {
    private double length;
    private double width;

    /**
     * Note that if length or width are less than or equal to zero the shape is
     * nonsensical.
     * If length or width are equal or less than zero,
     * then both length and width will be set to zero. (i.e. The area and perimeter
     * are also zero).
     * 
     * @param length
     * @param width
     */
    Rectangle(double length, double width) {
        // If length or width is zero or negativethe shape is nonsensical
        if (length <= 0 || width <= 0) {
            length = 0;
            width = 0;
            System.out.println("Warning: Negative length or width.");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Calcuates area of a rectangle
     * 
     * @return The area
     */
    @Override
    public double area() {
        double area = length * width;
        return area;
    }

    /**
     * Calculates the perimeter of the rectangle
     * 
     * @return The perimeter
     */
    @Override
    public double perimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
