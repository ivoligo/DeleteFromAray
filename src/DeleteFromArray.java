public class DeleteFromArray {
    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 3, 7, 3, 6, 4, 3, 5, 3};
        int[] arrayTest = new int[array.length];
        int numberForDelete = 3;
        for (int i = 0, j = 0; i < array.length - 1; i++, j++) {

            if (array[i] == numberForDelete) {
                i++;
            }
            arrayTest[j] = array[i];
        }

        for (int i = 0; i < arrayTest.length; i++) {
            array[i] = arrayTest[i];
        }

        printResult(array);
    }

    private static void printResult(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}