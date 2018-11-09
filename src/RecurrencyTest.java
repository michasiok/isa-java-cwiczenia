public class RecurrencyTest {
    public static void main(String[] args) {
        recursiveFunction(10);
    }
    static void recursiveFunction(int iterator){
        int iterations = 0;
        if(iterator>0){
            System.out.println("Iterator value: " + iterator);
            recursiveFunction(iterator-1);
        } else {
            System.out.println("Recursion is over.");
        }
    }
}
