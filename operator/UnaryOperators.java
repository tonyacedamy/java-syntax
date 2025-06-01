public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("a = " + a);    // Output: 5

        System.out.println("a++ = " + (a++));  // Post-increment: outputs 5, then a becomes 6
        System.out.println("After a++: a = " + a); // 6

        System.out.println("++a = " + (++a));  // Pre-increment: a becomes 7, then outputs 7

        System.out.println("a-- = " + (a--));  // Post-decrement: outputs 7, then a becomes 6
        System.out.println("After a--: a = " + a); // 6

        System.out.println("--a = " + (--a));  // Pre-decrement: a becomes 5, then outputs 5
    }
}
