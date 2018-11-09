//import java.util.Scanner;
//
//public class Ex3 {
//    public static void main(String[] args) {
//        int n = readNumberFromConsole(1);
//        if (greaterThanZero(n)) {
//            System.out.println("Podana liczba jest mniejsza od 0!");
//        } else {
//            int nextNumber = 1;
//            int previousNumber = 1;
//            int temp = 0;
//            if (n == 1) {
//                System.out.println(1);
//            } else {
//
//                for (int i = 2; i < n; i++) {
//                    temp = nextNumber;
//                    nextNumber += previousNumber;
//                    previousNumber = temp;
//                }
//                System.out.println(nextNumber);
//            }
//        }
//    }
//    static int fibonacciSequence(){
//
//    }
//
//    static int readNumberFromConsole(int numberInOrder){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę " + numberInOrder + ":");
//        return scanner.nextInt();
//    }
//    static boolean greaterThanZero(int number){
//        return number > 0 ? true : false;
//    }
//
//}

//Do refaktoru na funkcje
