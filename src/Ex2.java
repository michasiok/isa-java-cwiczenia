import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        int secondNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);
//        int[] greatests = findGreatestNumbers(firstNumber, secondNumber, thirdNumber);
//        System.out.println(Arrays.toString(greatests));
    }

    //Do ogarniecia

//    static int[] findGreatestNumbers(int... numbers){
//        int greatest = findGreatestNumber(numbers)
//        int greatestCount = countOccurences(numbers, greatest);
//
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] == greatest){
//                greatestCount++;
//            }
//        }
//
//        int[] result = new int[numbers.length];
//        for(int i = 0; i<greatestCount; i++){
//            result[i] = greatest;
//        }
//        return result;
//    }

    static int findGreatestNumber(int[] numbers){
        int greatest = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>greatest){
                greatest = numbers[i];
            }
        }
        return greatest;
    }
    static int readNumberFromConsole(int numberInOrder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę " + numberInOrder + ":");
        return scanner.nextInt();
    }
}
