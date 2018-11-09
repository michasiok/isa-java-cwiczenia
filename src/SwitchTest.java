public class SwitchTest {
    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNKNOWN
    }
    public static void main(String[] args) {
        final Direction direction = Direction.LEFT;

        switch (direction){
            case LEFT:
                System.out.println("LEWO");
                break;
            case RIGHT:
                System.out.println("PRAWO");
                break;
            case UP:
                System.out.println("GÓRA");
                break;
            case DOWN:
                System.out.println("DÓŁ");
                break;
                default:
                    System.out.println("NIEWIADOMY KIERUNEK");
        }
    }
}
