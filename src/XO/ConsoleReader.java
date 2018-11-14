package XO;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner = new Scanner(System.in);

    public int[] getCoords(Player activePlayer){
        System.out.println("Tura gracza " + activePlayer.getName());
        System.out.println("Podaj współrzędną X: ");
        int xCoord = scanner.nextInt();
        System.out.println("Podaj współrzędną Y: ");
        int yCoord = scanner.nextInt();
        int[] coords = {xCoord,yCoord};
        return coords;
    }

    public String getPlayerName(int playerNum){
        String index;
        String name;
        if(playerNum==1){
            index = "pierwszego";
        } else {
            index = "drugiego";
        }
        System.out.println("Podaj imię " + index + " gracza: ");
        name = scanner.nextLine();
        return name;
    }

    public String doContinue(){
        System.out.println("Czy chcesz zagrać jeszcze raz?");
        System.out.println("Wpisz: ");
        System.out.println("      'Y' aby kontynuować");
        System.out.println("      'N' aby zakończyć program");
        String res = scanner.nextLine();
        return res;
    }
    public int getBoardSize(){
        System.out.println("Podaj rozmiar planszy: ");
        int size = scanner.nextInt();
        return size;
    }
}
