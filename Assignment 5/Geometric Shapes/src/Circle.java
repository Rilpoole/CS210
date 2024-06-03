public class Circle implements IShape{
    private double radius;

    Circle(double radius){
        if(radius < 0){
            radius = 0.0;
        }
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
