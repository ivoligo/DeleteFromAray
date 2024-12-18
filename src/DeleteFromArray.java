public class DeleteFromArray {
    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 3, 7, 3, 6, 4, 3, 5, 3};
//        int[] array = new int[]{2, 4, 3, 7, 9, 9, 3, 6, 4, 3, 5, 3, 9, 9, 9, 9};
        int[] arrayTemp = new int[array.length];
        int numberForDelete = 3;
//        int numberForDelete = 9;
        int indexArrayResult = 0;

        for (int i = indexArrayResult; i < array.length; i++) {

            if (array[i] == numberForDelete) {

                continue;
            }
            arrayTemp[indexArrayResult] = array[i];
            indexArrayResult++;
        }

        copyArray(arrayTemp, array);
        printResult(array);
    }

    private static void copyArray(int[] arrayTemp, int[] array) {

        for (int k = 0; k < arrayTemp.length; k++) {
            array[k] = arrayTemp[k];
        }
    }

    private static void printResult(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}