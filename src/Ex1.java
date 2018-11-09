import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int number = readNumberFromConsole(1);
        int abs = countAbs(number);
        System.out.println("Wartość bezwględna: " + abs);
    }



    static int readNumberFromConsole(int numberInOrder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę " + numberInOrder + ":");
        return scanner.nextInt();
    }
    static int countAbs(int number){
        int abs = number < 0 ? number * -1 : number;
        return abs;
    }

}
