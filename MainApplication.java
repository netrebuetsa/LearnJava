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

        // выводим все четные элементы массива по индексу
        public void printEvenElementsByIndexInt() {
            for (int i = 0; i < intArray.length; i++) {
                if (i % 2 == 0) System.out.println("Четный элемент int-массива по индексу: " + i + " = " + intArray[i]);
            }
        }

         public  void printEvenElementsByIndexFloat() {
            for (int i = 0; i < intArray.length; i++) {
             if (i % 2 == 0) System.out.println("Четный элемент float-массива по индексу: " + i + " = " + intArray[i]);
        }
    }
         // выводим четные элементы массива по значению
         public  void printEvenElementsByValue() {
             for (int i = 0; i < intArray.length; i++) {
                 if (intArray[i] % 2 == 0) System.out.println("Четный элемент int-массива: " + i + " значение = " + intArray[i]);
             }
         }

        // выводим отрицательные элементы массива
        public  void printElementsNegativeInt() {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < 0) System.out.println("Отрицательный элемент int-массива: " + i + " = " + intArray[i]);
            }
        }
        public void printElementsNegativeFloat() {
            for (int i = 0; i < intArray.length; i++) {
                 if (intArray[i] <= 0f) System.out.println("Отрицательный элемент float-массива: " + i + " = " + intArray[i]);
                }
         }

        // выводим сумму массива по абсолютной величине
        public void printSumByAbsInt() {
            int asum = 0;
            for (int i = 0; i < intArray.length; i++) asum += Math.abs(intArray[i]);
                System.out.println("Сумма элеменотов по абсолютной величине int-массива: " + asum);

        }

         public  void printSumByAbsFloat() {
            float asum = 0;
             for (int i = 0; i < floatArray.length; i++) asum += Math.abs(floatArray[i]);
             System.out.println("Сумма элеменотов по абсолютной величине float-массива: " + asum);

        }

        // к отрицательному прибавляем 5, от положительного отнимаем 10
        public  void printAddSubstract() {
            int nsum = 0;
            int psum = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < 0) {nsum = intArray[i] + 5;
                    System.out.println("Отрицательный элемент int-массива + 5: " + nsum);}
                else {psum = intArray[i] - 10;
                System.out.println("Положительный элемент int-массива - 10: " + psum);}
            }
        }

        // отрицательный умножаем на 2, положительный делим на 1.5
        public  void printMultiplyDivide() {
            float nsum = 0;
            double psum = 0;
            for (int i = 0; i < floatArray.length; i++) {
                if (floatArray[i] < 0f) {nsum = floatArray[i] * 2;
                    System.out.println("Отрицательный элемент float-массива умноженный на 2: " + nsum);}
                else {psum = floatArray[i] / 1.5;
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
             firstArray.printEvenElementsByIndexInt();
             firstArray.printEvenElementsByIndexFloat();

             // выводим четные элементы массива по значению
             firstArray.printEvenElementsByValue();

             // выводим отрицательные элементы массива
             firstArray.printElementsNegativeInt();
             firstArray.printElementsNegativeFloat();

             // выводим сумму массива по абсолютной величине
             firstArray.printSumByAbsInt();
             firstArray.printSumByAbsFloat();

             // к отрицательному прибавляем 5, от положительного отнимаем 10
             firstArray.printAddSubstract();

             // отрицательный умножаем на 2, положительный делим на 1.5
             firstArray.printMultiplyDivide();

         }
    }
