public interface IShape {
    public default double area(){
        return 0.0;
    };
    public default double perimeter(){
        return 0.0;
    };
}
