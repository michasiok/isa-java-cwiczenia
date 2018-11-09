public class MultiDimensionalArraysTest {
    public static void main(String[] args) {
        int[][] gameBoard = new int[10][];

for(int i = 0; i < 10; i++){
    gameBoard[i] = new int[5];
}


        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}
