import java.util.ArrayList;
import java.util.List;

public class DoubleWrapper {
    public static void main(String[] args) {
        // 1. double is a primitive type
        double d1 = 123.456;
        System.out.println("Primitive double d1: " + d1);

        // 2. Double is a wrapper class (object)
        Double d2 = 789.012; // Autoboxing
        System.out.println("Wrapper Double d2: " + d2);

        // 3. Autoboxing & Unboxing
        Double d3 = 3.14;         // Autoboxing: double → Double
        double d4 = d3;           // Unboxing: Double → double
        System.out.println("Autoboxed d3: " + d3);
        System.out.println("Unboxed d4: " + d4);

        // 4. NullPointerException when unboxing null
        Double dNull = null;
        try {
            double d5 = dNull;    // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException when unboxing a null Double");
        }

         // 5. Useful Methods in the Double Class
         //parseDouble: Converts a String to a primitive double
        String input = "3.14159";
        double pi = Double.parseDouble(input);
        System.out.println("parseDouble: " + pi);

        //valueOf: Returns a Double object from a String
        Double boxed = Double.valueOf("42.0");
        System.out.println("valueOf: " + boxed);

        //compare: Tells you if one number is greater, equal, or smaller
        // Returns -1 if first is smaller, 0 if equal, 1 if greater
        double a = 5.5;
        double b = 7.7;
        int comparison = Double.compare(a, b);
        System.out.println("compare(5.5, 7.7): " + comparison); // Expected: -1

        //isNaN: Checks if the value is “Not a Number”
        double notANumber = 0.0 / 0.0;
        System.out.println("isNaN (0.0 / 0.0): " + Double.isNaN(notANumber)); // Expected: true

        //isInfinite: Checks for positive or negative infinity
        double posInf = 1.0 / 0.0;
        double negInf = -1.0 / 0.0;
        System.out.println("isInfinite (1.0 / 0.0): " + Double.isInfinite(posInf));  // true
        System.out.println("isInfinite (-1.0 / 0.0): " + Double.isInfinite(negInf)); // true

        //doubleValue: Extracts the primitive value from a Double object
        Double d = 99.99;
        double primitive = d.doubleValue();
        System.out.println("doubleValue: " + primitive); // Expected: 99.99

        //equals: Compares Double objects for equality
        Double v1 = 10.0;
        Double v2 = 10.0;
        Double v3 = 15.0;
        System.out.println("equals (10.0, 10.0): " + v1.equals(d2)); // true
        System.out.println("equals (10.0, 15.0): " + v2.equals(d3)); // false

        //max, min, sum: Quick math helpers
        double x = 3.3;
        double y = 7.7;
        System.out.println("max(3.3, 7.7): " + Double.max(x, y)); // 7.7
        System.out.println("min(3.3, 7.7): " + Double.min(x, y)); // 3.3
        System.out.println("sum(3.3, 7.7): " + Double.sum(x, y)); // 11.0
    }
}
