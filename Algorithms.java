import java.util.Random;



public class Algorithms{

    public static void main(String args[])
    {

       int [] massiv = returnMassiv(10);
        int [] massiv_2 = returnMassiv(15);



       // int[] massiv = {0, 1, 1, 2, 3, 5};
        System.out.println();
        //System.out.println(maxElement(massiv));
        bubbleSort(massiv);
        System.out.println();
        bubbleSort(massiv_2);
        int[] massiv_3 = merge(massiv, massiv_2);
        for (int i = 0; i < massiv_3.length; i++) {
            System.out.print(massiv_3[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] massiv, int[] massiv_2) {
        int[] massiv_result = new int[massiv.length + massiv_2.length];
        int m1 = 0;
        int m2 = 0;
        for (int i = 0; m1 < massiv.length && m2 < massiv_2.length; i++) {
            if (massiv[m1] < massiv_2[m2]) {
                massiv_result[i] = massiv[m1];
                m1++;
            }
            else {
                massiv_result[i] = massiv_2[m2];
                m2++;
            }
        }
        while (m1 != massiv.length) {
            massiv_result[m2 + m1] = massiv[m1];
            m1++;
        }
        while (m2 != massiv_2.length) {
            massiv_result[m1 + m2] = massiv_2[m2];
            m2++;
        }

        return massiv_result;
    }

    public static int[] returnMassiv(int count) {

        Random rand = new Random();

        int [] massiv = new int[count];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(1000);
            System.out.print(massiv[i] + " ");
        }
        return massiv;
    }
    public static int maxElement (int[] massiv) {
        int max = massiv[0];
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] > max) max = massiv[i];

        }
        return max;
    }

    public static void bubbleSort (int[] massiv){
        for (int j = 0; j < massiv.length; j++) {
            boolean flag = false;

            for (int i = 0; i < massiv.length - j - 1; i++) {
                if (massiv[i] > massiv[i+1]) {
                    int temp = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = temp;
                    flag = true;

                }
            }
            if (!flag) break;
        }

    }
}