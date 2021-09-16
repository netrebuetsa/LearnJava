
class Main2 {

    public static void main(String[] args) {

        Shape[] shape = {new Circle(1, 0.5, 2),
                new Rectangle(0.1, 5, 0.5, 1.2),
                new Rectangle(4, 0.55, 2.3, 3.4),
                new Circle(13, 6, 5.5)};

        System.out.println();
        for (int i = 0; i < shape.length; i++) {
            System.out.println("Shape type: " + shape[i].setType());
            System.out.println("Coordinates : x=" + shape[i].getCoordX() + " y=" + shape[i].getCoordY());
            System.out.println("Area of " + shape[i].setType() + " " + i + " = " + shape[i].area());

        }
    }
}