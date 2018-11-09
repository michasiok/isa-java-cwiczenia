import java.util.Scanner;

public class ConsoleScanner {
    public static void main(String[] args) {
     int firstNumber = readNumberFromConsole(1);
     int secondNumber = readNumberFromConsole(2);
     int thirdNumber = readNumberFromConsole(3);
     double avg = countAvg(firstNumber,secondNumber,thirdNumber);
        System.out.println("Srednia: " + avg);

    }
    static int readNumberFromConsole(int numberInOrder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę " + numberInOrder + ":");
        return scanner.nextInt();
    }
    static double countAvg(int... numbers){
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        return sum / numbers.length;
    }
}
