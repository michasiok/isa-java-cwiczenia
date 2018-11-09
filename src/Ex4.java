import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = in.nextInt();
        int result = 0;
        for(int i = 0; i<n; i++){
            result+=Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
