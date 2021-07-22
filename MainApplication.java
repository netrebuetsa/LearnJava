import java.util.Random;
import java.util.Scanner;
// объявили массивы
 class Array {
   private int[] intArray;
   private float[] floatArray;

// создали массивы
    Array(int intsize, int floatsize){
        intArray = new int[intsize];
        floatArray = new float[floatsize];
    }


    //генерируем случайные числа

    public int intervalIntRandom(int min, int max) {
        Random rnd = new Random();
        int i = rnd.nextInt(max - min + 1) + min;
        return i;
    }

    public float intervalFloatRandom(int min, int max) {
        Random rnd = new Random();
        float i = rnd.nextFloat() * (max - min) + min;
        return i;
    }
        // указываем размер массива
    public static int getSize() {
            Scanner in = new Scanner(System.in);
            System.out.print("Array size:  ");
            int size = in.nextInt();
    return size;
        }
        //создаем массив int и заполняем его значениями
    public void setIntArrayValues(int minvalue, int maxvalue) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intervalIntRandom(minvalue, maxvalue);
        }
    }
    public void setFloatArrayValues(int minvalue, int maxvalue) {
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = intervalFloatRandom(minvalue, maxvalue);
            }
    }
    //выводим значения массива
     public void printArrayElem() {
        for (int i = 0; i < intArray.length; i++)
            System.out.println("Элемент int-массив: " + i + " = " + intArray[i]);
        }

      public void printFloatArrayElem() {
        for (int i = 0; i < floatArray.length; i++)
            System.out.println("Элемент float-массив: " + i + " = " + floatArray[i]);
        }

        //заполняем массив значениями

        // считаем сумму элементов в массиве
        public int getSumIntArray() {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++)
            sum = sum + intArray[i];
        return sum;
        }

        public float getSumFloatArray() {
            float sum = 0;
            for (int i = 0; i < floatArray.length; i++)
                sum = sum + floatArray[i];
            return sum;
        }

    }
     public class MainApplication {
         public static  void main(String[] args) {
             int intsize = Array.getSize();
             int floatsize = Array.getSize();
             Array firstArray = new Array(intsize, floatsize);

             firstArray.setIntArrayValues(-10, 10);
             firstArray.printArrayElem();

             firstArray.setFloatArrayValues(-10, 10);
             firstArray.printFloatArrayElem();

             // выводим сумму элементов в массиве
             int isum = firstArray.getSumIntArray();
             System.out.println("Сумма элементоа int-массива: " + isum);

             float fsum = firstArray.getSumFloatArray();
             System.out.println("Сумма элементоа float-массива: " + fsum);
         }
    }
