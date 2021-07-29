import java.util.Random;
import java.util.Scanner;
// объявили массивы
 class Array {
    int[] intArray;
    float[] floatArray;

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

        // выводим все четные элементы массива по индексу
        public static void printEvenElementsByIndex(int[] Array) {
            for (int i = 0; i < Array.length; i++) {
                if (i % 2 == 0) System.out.println("Четный элемент int-массива по индексу: " + i + " = " + Array[i]);
            }
        }

         public static void printEvenElementsByIndex(float[] Array) {
            for (int i = 0; i < Array.length; i++) {
             if (i % 2 == 0) System.out.println("Четный элемент float-массива по индексу: " + i + " = " + Array[i]);
        }
    }
         // выводим четные элементы массива по значению
         public static void printEvenElementsByValue(int[] Array) {
             for (int i = 0; i < Array.length; i++) {
                 if (Array[i] % 2 == 0) System.out.println("Четный элемент int-массива: " + i + " значение = " + Array[i]);
             }
         }

        // выводим отрицательные элементы массива
        public static void printElementsNegativeInt(int[] Array) {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] < 0) System.out.println("Отрицательный элемент int-массива: " + i + " = " + Array[i]);
            }
        }
        public static void printElementsNegativeFloat(float[] Array) {
            for (int i = 0; i < Array.length; i++) {
                 if (Array[i] <= 0f) System.out.println("Отрицательный элемент float-массива: " + i + " = " + Array[i]);
                }
         }

        // выводим сумму массива по абсолютной величине
        public static void printSumByAbs(int[] Array) {
            int asum = 0;
            for (int i = 0; i < Array.length; i++) asum += Math.abs(Array[i]);
                System.out.println("Сумма элеменотов по абсолютной величине int-массива: " + asum);

        }

         public static void printSumByAbs(float[] Array) {
            float asum = 0;
             for (int i = 0; i < Array.length; i++) asum += Math.abs(Array[i]);
             System.out.println("Сумма элеменотов по абсолютной величине float-массива: " + asum);

        }

        // к отрицательному прибавляем 5, от положительного отнимаем 10
        public static void printAddSubstract(int[] Array) {
            int nsum = 0;
            int psum = 0;
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] < 0) {nsum = Array[i] + 5;
                    System.out.println("Отрицательный элемент int-массива + 5: " + nsum);}
                else {psum = Array[i] - 10;
                System.out.println("Положительный элемент int-массива - 10: " + psum);}
            }
        }

        // отрицательный умножаем на 2, положительный делим на 1.5
        public static void printMultiplyDivide(float[] Array) {
            float nsum = 0;
            double psum = 0;
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] < 0f) {nsum = Array[i] * 2;
                    System.out.println("Отрицательный элемент float-массива умноженный на 2: " + nsum);}
                else {psum = Array[i] / 1.5;
                    System.out.println("Положительный элемент float-массива деленный на 1.5: " + psum);}
            }
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

             //выводим все четные элементы массива по индексу
             Array.printEvenElementsByIndex(firstArray.intArray);
             Array.printEvenElementsByIndex(firstArray.floatArray);

             // выводим четные элементы массива по значению
             Array.printEvenElementsByValue(firstArray.intArray);

             // выводим отрицательные элементы массива
             Array.printElementsNegativeInt(firstArray.intArray);
             Array.printElementsNegativeFloat(firstArray.floatArray);

             // выводим сумму массива по абсолютной величине
             Array.printSumByAbs(firstArray.intArray);
             Array.printSumByAbs(firstArray.floatArray);

             // к отрицательному прибавляем 5, от положительного отнимаем 10
             Array.printAddSubstract(firstArray.intArray);

             // отрицательный умножаем на 2, положительный делим на 1.5
             Array.printMultiplyDivide(firstArray.floatArray);

         }
    }
