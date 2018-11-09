public class FunctionsTest {
    public static void main(String[] args) {
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates = {5, 6, 7, 8, 9};
        double[] someDoubles = {10.5};

        int yCoordinatesSum = countSumOfElements(yCoordinates);
        int xCoordinatesSum = countSumOfElements(xCoordinates);

        System.out.println("Suma X to: " + xCoordinatesSum);
        System.out.println("Suma Y to: " + yCoordinatesSum);
        System.out.println("Średnia X to: " + countAverageOfElements(xCoordinates));
        System.out.println("Średnia Y to: " + countAverageOfElements(yCoordinates));
    }

    static int countSumOfElements(int[] inputArray) {
        int sum = 0;
        for (int anInputArray : inputArray) {
            sum += anInputArray;
        }
        return sum;
    }

    static double countAverageOfElements(int[] inputArray) {
        double sum = countSumOfElements(inputArray);
        return sum / inputArray.length;
    }

}
