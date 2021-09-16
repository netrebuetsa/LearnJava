
public abstract class Shape {

     double coord_x;
     double coord_y;

    Shape(double coord_x, double coord_y) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    public double getCoordX() {
        return coord_x;
    }

    public double getCoordY() {
        return coord_y;
    }

    abstract double area();

    abstract String setType();



}