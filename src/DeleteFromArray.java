public class DeleteFromArray {
    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 3, 7, 3, 6, 4, 3, 5, 3};
//        int[] array = new int[]{2, 4, 3, 7, 9, 9, 3, 6, 4, 3, 5, 3, 9, 9, 9, 9};
        int[] arrayResult = new int[array.length];
        int numberForDelete = 3;
//        int numberForDelete = 9;
        int indexArrayResult = 0;

        for (int i = indexArrayResult; i < array.length; i++) {

            if (array[i] == numberForDelete) {

                continue;
            }
            arrayResult[indexArrayResult] = array[i];
            indexArrayResult++;
        }

        for (int k = 0; k < arrayResult.length; k++) {
            array[k] = arrayResult[k];
        }

        printResult(array);
    }

    private static void printResult(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}