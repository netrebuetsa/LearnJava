
public class Circle extends Shape {
   private double radius;

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

    double getRadius() {
        return radius;
    }

    @Override
    public void print(){
        System.out.println("Я круг");
    }

    @Override
    public boolean equals(Object someObject) {
        if (this == someObject)
            return true;
        if (!super.equals(someObject)) return false;

        Circle circle = (Circle) someObject;



        if (this.radius != circle.radius) {
            System.out.println("Radius are not equal");
            return false;
        }
        else return true;
    }

}