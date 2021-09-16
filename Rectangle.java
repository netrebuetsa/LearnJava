
public class Rectangle extends Shape {

     double width;
     double length;

    Rectangle(double coord_x, double coord_y, double width, double lenght) {
        super(coord_x, coord_y);
        this.width = width;
        this.length = lenght;
    }


    @Override
    String setType() {
        return "rectangle";
    }

    @Override
    double area() {
        return width * length;
    }

}