import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task1
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        String[] arrayString = new String[4];
        arrayString[0] = "Winter";
        arrayString[1] = "Spring";
        arrayString[2] = "Summer";
        arrayString[3] = "Fall";

        //Task2
        task2(arrayInt, arrayDouble, arrayString);

        //Task3
        task3(arrayInt, arrayDouble, arrayString);

        //Task4
        task4(arrayInt);

    }


    private static void task2(int[] arrayInt, double[] arrayDouble, String[] arrayString) {
        for (int i = 0; i < arrayInt.length - 1; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println(arrayInt[arrayInt.length-1]);

        for (int i = 0; i < arrayDouble.length - 1; i++) {
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println(arrayDouble[arrayDouble.length - 1]);

        for (int i = 0; i < arrayString.length - 1; i++) {
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println(arrayString[arrayString.length - 1]);
    }

    private static void task3(int[] arrayInt, double[] arrayDouble, String[] arrayString) {
        for (int i = arrayInt.length-1; i > 0 ; i--) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println(arrayInt[0]);

        for (int i = arrayDouble.length - 1; i > 0; i--) {
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println(arrayDouble[0]);

        for (int i = arrayString.length - 1; i > 0; i--) {
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println(arrayString[0]);
    }

    private static void task4(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i]%2 != 0){
                arrayInt[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}