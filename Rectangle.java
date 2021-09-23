
public class Rectangle extends Shape {

     double width;
     double length;

    Rectangle(double coord_x, double coord_y, double width, double lenght) {
        super(coord_x, coord_y);
        this.width = width;
        this.length = lenght;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    @Override
    String setType() {
        return "rectangle";
    }

    @Override
    double area() {
        return width * length;
    }

    @Override
    public void print(){
        System.out.println("Я прямоугольник");
    }

    @Override
    public boolean equals(Object someObject){
        if (this == someObject)
            return true;


        Rectangle rectangle = (Rectangle) someObject;

        if (this.getCoordX() != rectangle.getCoordX())
            return false;
        if (this.getCoordY() != rectangle.getCoordY())
            return false;

        if (this.width != rectangle.getWidth())
            return false;
        if (this.length != rectangle.getLength())
            return false;
        else return true;
    }

}