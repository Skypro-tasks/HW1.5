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
        for (int i = 0; i < arrayInt.length; i++) {
            if(i == arrayInt.length - 1){
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            if(i == arrayDouble.length - 1){
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }

        for (int i = 0; i < arrayString.length; i++) {
            if(i == arrayString.length - 1){
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
    }

    private static void task3(int[] arrayInt, double[] arrayDouble, String[] arrayString) {
        for (int i = arrayInt.length-1; i >= 0 ; i--) {
            if(i == 0){
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if(i == 0){
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }

        for (int i = arrayString.length - 1; i >= 0; i--) {
            if(i == 0){
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
    }

    private static void task4(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i]%2 != 0){
                arrayInt[i]+=1;
            }
            if(i == arrayInt.length - 1){
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }
    }
}