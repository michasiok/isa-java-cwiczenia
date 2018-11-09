public class LengthTest {
    public static void main(String[] args) {
        double x1 = 127.89;
        double y1 = 92.12;

        double x2 = 24.12;
        double y2 = 82.91;
        double result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(result);
    }
}
