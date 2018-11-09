public class LogicalOperatorsTest {
    public static void main(String[] args) {
        boolean isCircle = true;
        double r = 5.25;
        if (isCircle && r > 10) {
            System.out.println("To jest duże koło");
        } else if (isCircle) {
            System.out.println("To jest małe koło");
        } else {
            System.out.println("To nie jest koło");
        }
    }
}
