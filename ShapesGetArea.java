
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

        System.out.println();
        Circle[] circle = {new Circle(1, 1, 2),
                new Circle(1, 1, 2),
                new Circle(2, 1, 2)};

        for (int i = 0; i < circle.length; i++) {
            for (int j = i + 1; j < circle.length; j++) {

                System.out.println("Первая координата круга :  x=" + circle[i].getCoordX() + " y=" + circle[i].getCoordY() + " Radius=" + circle[i].getRadius());
                System.out.println("Вторая координата круга : x=" + circle[j].getCoordX() + " y=" + circle[j].getCoordY() + " Radius=" + circle[j].getRadius());
                System.out.println("Формы равные: " + circle[i].equals(circle[j]));

            }
        }

        System.out.println();
        Rectangle[] restangle = {new Rectangle(1, 1, 3, 4),
                new Rectangle(1, 1, 4, 5),
                new Rectangle(1, 1,4,5)};

        for (int k = 0; k < restangle.length; k++) {
            for (int n = k + 1; n < restangle.length; n++) {
                System.out.println("Первая координата прямоугольника :  x=" + restangle[k].getCoordX() + " y=" + restangle[k].getCoordY() + " Ширина : =" + restangle[k].getWidth() + " Длина : +" + restangle[k].getLength());
                System.out.println("Вторая координата прямоугольника : x=" + restangle[n].getCoordX() + " y=" + restangle[n].getCoordY() + " Ширина : =" + restangle[k].getWidth() + " Длина : +" + restangle[k].getLength());
                System.out.println("Формы равные: " + restangle[k].equals(restangle[n]));

            }
        }

        for (int i = 0; i < shape.length; i++) {
            Printer(shape[i]);
        }


    }
    public static void Printer(Printable printable) {
        printable.print();


    }




    }

