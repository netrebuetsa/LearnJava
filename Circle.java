
public class Circle extends Shape {
     double radius;

    Circle(double coord_x, double coord_y, double radius) {
        super(coord_x, coord_y);
        this.radius = radius;
    }


    @Override
    String setType() {
        return "circle";
    }

    @Override
    double area() {
        return Math.pow(radius, 2) * Math.PI;
    }


}