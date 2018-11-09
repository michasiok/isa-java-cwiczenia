
import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        char[] charArrayA = getInputCharArray("A");
        char[] charArrayB = getInputCharArray("B");

        charArrayA = checkChars(charArrayA);
        charArrayB = checkChars(charArrayB);

        checkWinner(charArrayA, charArrayB);


    }

    static char[] checkChars(char[] array) {
        char[] tempArray = array;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '*') {
                tempArray = eraseChars(tempArray, i);
            }
        }
        return tempArray;
    }


    static char[] eraseChars(char[] array, int index) {
        if (index == 0) {
            array[1] = '_';
        } else if (index == array.length - 1) {
            array[array.length - 2] = '_';
        } else {
            array[index - 1] = '_';
            array[index + 1] = '_';
        }
        return array;
    }

    static String readStringFromConsole(String team) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drużyna " + team + " podaje ciąg znaków:");
        return scanner.nextLine();
    }

    static int countPoints(String team, char[] array) {
        int points = 0;
        if (team.equals("A")) {
            for (int i = 0; i < array.length; i++) {
                switch (array[i]) {
                    case 'w':
                        points += 4;
                        break;
                    case 'p':
                        points += 3;
                        break;
                    case 'b':
                        points += 2;
                        break;
                    case 's':
                        points += 1;
                        break;
                }
            }
        } else if (team.equals("B")) {
            for (int i = 0; i < array.length; i++) {
                switch (array[i]) {
                    case 'm':
                        points += 4;
                        break;
                    case 'q':
                        points += 3;
                        break;
                    case 'd':
                        points += 2;
                        break;
                    case 'z':
                        points += 1;
                        break;
                }
            }
        }
        return points;
    }

    static void checkWinner(char[] arrayA, char[] arrayB) {
        if (countPoints("A", arrayA) > countPoints("B", arrayB)) {
            System.out.println("A wygrywa!");
        } else if (countPoints("B", arrayB) > countPoints("A", arrayA)) {
            System.out.println("B wygrywa!");
        } else {
            System.out.println("Remis!");
        }
        showArrays(arrayA, arrayB);
    }

    static void showArrays(char[] arrayA, char[] arrayB) {
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
    }

    static char[] getInputCharArray(String team) {
        return readStringFromConsole(team).toCharArray();
    }
}

