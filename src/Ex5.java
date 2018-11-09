import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        calculator();
    }

    static String readOperatorFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz znak operacji arytmetycznej, którą chcesz wykonać lub 'q' aby wyjść: ");
        return scanner.nextLine();
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę " + numberInOrder + ":");
        return scanner.nextInt();
    }

    static void doMath(double firstNumber, double secondNumber, String mathOperator) {
        switch (mathOperator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
                case "q":
                    break;
                default:
                    System.out.println("Błędny operator matematyczny!");
        }
    }
    static void calculator(){
        double firstNumber = readNumberFromConsole(1);
        double secondNumber = readNumberFromConsole(2);
        String operator = readOperatorFromConsole();
        doMath(firstNumber, secondNumber, operator);
        if (!operator.equals("q")) {
            calculator();
        }
    }
}
