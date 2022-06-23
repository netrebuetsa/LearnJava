
public abstract class Shape implements Printable {

    private double coord_x;
   private double coord_y;

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

    @Override
    public boolean equals(Object someObject){
        if (this == someObject)
            return true;

    if (someObject instanceof Shape) {
    Shape shape = (Shape) someObject;
        return this.coord_x == shape.coord_x && this.coord_y == shape.coord_y;
    }

    else return false;


    }





}

interface Printable {
    public void print();
}



