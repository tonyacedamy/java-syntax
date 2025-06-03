public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // If a > b then max = a, else max = b
        int max = (a > b) ? a : b;

        System.out.println("Max = " + max); // 20
    }
}
