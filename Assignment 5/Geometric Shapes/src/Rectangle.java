public class Rectangle implements IShape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        // If length or width is zero the shape is nonsensical
        if (length < 0 || width < 0) {
            length = 0;
            width = 0;
            System.out.println("Warning: Negative length or width.");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        double area = length * width;
        return area;
    }

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
