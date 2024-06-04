public interface IShape {
    /**
     * Calculates the area of the shape
     * 
     * @return The area
     */
    public default double area() {
        return 0.0;
    };

    /**
     * Calculates the perimeter of the shape.
     * 
     * @return The perimeter
     */
    public default double perimeter() {
        return 0.0;
    };
}
