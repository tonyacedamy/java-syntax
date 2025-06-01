public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        a = 20;      // Assign 20 to a
        System.out.println("a = " + a); // 20

        a += 5;      // Equivalent to a = a + 5
        System.out.println("a += 5 => " + a); // 25

        a -= 3;      // Equivalent to a = a - 3
        System.out.println("a -= 3 => " + a); // 22

        a *= 2;      // Equivalent to a = a * 2
        System.out.println("a *= 2 => " + a); // 44

        a /= 4;      // Equivalent to a = a / 4
        System.out.println("a /= 4 => " + a); // 11

        a %= 3;      // Equivalent to a = a % 3
        System.out.println("a %= 3 => " + a); // 2
    }
}
